import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Clase que procesa un documento JSON de una lista de reproducción de Spotify para realizar
 * consultas específicas, cumpliendo con el ejercicio 4 del Trabajo Práctico 3 de la materia
 * Laboratorio de Programación, correspondiente a la carrera Licenciatura en Sistemas de la
 * Universidad Nacional de la Patagonia Austral (UNPA), año 2025.
 * 
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025-05-04
 */
public class ProcesadorJsonListaReproduccion {

    /**
     * Método principal que crea un documento JSON de una lista de reproducción de Spotify
     * y realiza consultas para: listar título, duración y género de canciones; contar artistas
     * por canción; filtrar canciones por palabras en el título; y buscar canciones por artista.
     * Los resultados se muestran en la consola con un formato decorativo.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     * @throws Exception Si ocurre un error al construir o procesar el JSON.
     */
    public static void main(String[] args) {
        try {
            // Crear el arreglo de canciones
            JSONArray canciones = new JSONArray();

            // Canción 1
            JSONObject cancion1 = new JSONObject();
            cancion1.put("titulo", "Bohemian Rhapsody");
            cancion1.put("artistas", new JSONArray(new String[]{"Queen"}));
            cancion1.put("album", "A Night at the Opera");
            cancion1.put("duracion", 354);
            cancion1.put("genero", "Rock");
            canciones.put(cancion1);

            // Canción 2
            JSONObject cancion2 = new JSONObject();
            cancion2.put("titulo", "Shape of You");
            cancion2.put("artistas", new JSONArray(new String[]{"Ed Sheeran"}));
            cancion2.put("album", "÷");
            cancion2.put("duracion", 233);
            cancion2.put("genero", "Pop");
            canciones.put(cancion2);

            // Canción 3
            JSONObject cancion3 = new JSONObject();
            cancion3.put("titulo", "Blinding Lights");
            cancion3.put("artistas", new JSONArray(new String[]{"The Weeknd", "Max Martin"}));
            cancion3.put("album", "After Hours");
            cancion3.put("duracion", 200);
            cancion3.put("genero", "Synthpop");
            canciones.put(cancion3);

            // Crear el objeto de la lista de reproducción
            JSONObject lista = new JSONObject();
            lista.put("id", "PL123");
            lista.put("nombre", "Mis Éxitos Favoritos");
            lista.put("descripcion", "Una colección de mis canciones favoritas de varios géneros");
            lista.put("creador", "JuanPerez");
            lista.put("canciones", canciones);

            // Mostrar el JSON generado
            System.out.println("==================================================");
            System.out.println("** Ejercicio 4 - Trabajo Práctico 3 **");
            System.out.println("** Materia: Laboratorio de Programación **");
            System.out.println("** Carrera: Licenciatura en Sistemas, UNPA 2025 **");
            System.out.println("==================================================");
            System.out.println();
            System.out.println("Documento JSON de la lista de reproducción:");
            System.out.println("--------------------------------------------------");
            System.out.println(lista.toString(2));
            System.out.println("--------------------------------------------------");
            System.out.println();

            // 4.a) Listar título, duración y género de todas las canciones
            System.out.println("** 4.a) Listar título, duración y género de canciones **");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < canciones.length(); i++) {
                JSONObject cancion = canciones.getJSONObject(i);
                String titulo = cancion.getString("titulo");
                int duracion = cancion.getInt("duracion");
                String genero = cancion.getString("genero");
                System.out.printf("Canción: %s, Duración: %d segundos, Género: %s%n", titulo, duracion, genero);
            }
            System.out.println("--------------------------------------------------");
            System.out.println();

            // 4.b) Contar artistas por canción
            System.out.println("** 4.b) Títulos de canciones y número de artistas **");
            System.out.println("--------------------------------------------------");
            for (int i = 0; i < canciones.length(); i++) {
                JSONObject cancion = canciones.getJSONObject(i);
                String titulo = cancion.getString("titulo");
                JSONArray artistas = cancion.getJSONArray("artistas");
                int numArtistas = artistas.length();
                System.out.printf("Canción: %s, Número de artistas: %d%n", titulo, numArtistas);
            }
            System.out.println("--------------------------------------------------");
            System.out.println();

            // 4.c) Filtrar canciones por dos palabras en el título
            String palabra1 = "Shape";
            String palabra2 = "You";
            System.out.println("** 4.c) Canciones con las palabras '" + palabra1 + "' y '" + palabra2 + "' en el título **");
            System.out.println("--------------------------------------------------");
            boolean found = false;
            for (int i = 0; i < canciones.length(); i++) {
                JSONObject cancion = canciones.getJSONObject(i);
                String titulo = cancion.getString("titulo").toLowerCase();
                if (titulo.contains(palabra1.toLowerCase()) && titulo.contains(palabra2.toLowerCase())) {
                    System.out.println("Canción encontrada: " + cancion.getString("titulo"));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No se encontraron canciones con ambas palabras.");
            }
            System.out.println("--------------------------------------------------");
            System.out.println();

            // 4.d) Buscar canciones por artista
            String artistaBuscado = "The Weeknd";
            System.out.println("** 4.d) Canciones con el artista '" + artistaBuscado + "' **");
            System.out.println("--------------------------------------------------");
            found = false;
            for (int i = 0; i < canciones.length(); i++) {
                JSONObject cancion = canciones.getJSONObject(i);
                JSONArray artistas = cancion.getJSONArray("artistas");
                for (int j = 0; j < artistas.length(); j++) {
                    if (artistas.getString(j).equalsIgnoreCase(artistaBuscado)) {
                        System.out.println("Canción encontrada: " + cancion.getString("titulo"));
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("No se encontraron canciones con el artista '" + artistaBuscado + "'.");
            }
            System.out.println("--------------------------------------------------");
            System.out.println();

            System.out.println("Consultas completadas exitosamente.");
            System.out.println("==================================================");

        } catch (Exception e) {
            System.err.println("==================================================");
            System.err.println("Error al procesar el JSON: " + e.getMessage());
            System.err.println("==================================================");
            e.printStackTrace();
        }
    }
}
