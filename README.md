# Programación II · Curso 2025-2026

Repositorio oficial de materiales y ejercicios de la asignatura **Programación II** de la **Facultad de Ingeniería de la Universidad de Deusto**.

Este repositorio se comparte con el alumnado como espacio de distribución del código de los ejercicios que se realizan en el aula.

## Estructura del repositorio

Actualmente, el contenido principal está organizado en la carpeta:

- `P2-01-POO/`

Dentro de ella se incluyen distintos proyectos relacionados con **Programación Orientada a Objetos (POO)**, por ejemplo:

- `01-01_Libreria`
- `01-02_Estudiantes`
- `01-03_Pong`
- `01-04_Ex_Ord_2016`
- `01-05_Cine`
- `01-06_Escape_Room`
- `01-07_CampusHub`

Cada uno de ellos debe tratarse como un proyecto independiente.

## Entorno de trabajo recomendado

Para trabajar con este repositorio se recomienda:

- **Eclipse IDE for Java Developers**
- conexión a Internet
- plugin **EGit** instalado en Eclipse  
  (en muchas instalaciones de Eclipse ya viene incorporado)

## Cómo clonar el repositorio desde Eclipse

La forma recomendada de acceso para el alumnado es mediante **EGit** desde Eclipse. El procedimiento general es el siguiente: :contentReference[oaicite:1]{index=1}

1. Abrir Eclipse.
2. Opcionalmente, cambiar a la perspectiva **Git**:
   - `Window → Perspective → Open Perspective → Other… → Git`
3. Ir a:
   - `File → Import…`
4. Seleccionar:
   - `Git → Projects from Git`
5. Elegir:
   - `Clone URI`
6. Introducir la URL del repositorio:
   - `https://github.com/bosanz/Programacion_II_25-26`
7. Seleccionar la rama principal, normalmente:
   - `main`
8. Elegir la carpeta local donde se descargará el repositorio.
9. Importar los proyectos con:
   - `Import existing Eclipse projects`

Una vez importados, conviene cambiar a la perspectiva **Java** y comprobar que cada proyecto contiene su carpeta `src` y que la configuración del JRE es correcta. :contentReference[oaicite:2]{index=2}

## Cómo actualizar el repositorio cuando haya cambios

Cuando el profesorado publique cambios, el alumnado debe sincronizar su copia local desde Eclipse. El procedimiento recomendado es: :contentReference[oaicite:3]{index=3}

1. Clic derecho sobre el proyecto o sobre el repositorio.
2. Ir a:
   - `Team → Pull`

Según la versión de Eclipse, también puede aparecer la opción:

- `Team → Fetch from Upstream` y después `Merge`

## Si Eclipse no detecta automáticamente los proyectos

En algunos casos, tras clonar el repositorio, Eclipse no detecta los proyectos automáticamente. Si ocurre esto, se puede importar manualmente así: :contentReference[oaicite:4]{index=4}

1. Ir a:
   - `File → Import…`
2. Seleccionar:
   - `General → Existing Projects into Workspace`
3. Elegir como carpeta raíz la carpeta local donde se clonó el repositorio.
4. Marcar los proyectos detectados.
5. Pulsar `Finish`.

## Recomendaciones importantes para el alumnado

Para evitar problemas al trabajar con el repositorio:

- no modificar ni borrar carpetas como `bin/` si han sido gestionadas específicamente por el profesorado
- si algún proyecto incluye librerías en `libs/`, comprobar que estén correctamente añadidas al **Build Path**
- actualizar el repositorio con frecuencia para disponer de los últimos cambios publicados
- trabajar únicamente sobre los proyectos indicados en clase

Estas recomendaciones forman parte de las instrucciones distribuidas al alumnado para la gestión del repositorio desde Eclipse. :contentReference[oaicite:5]{index=5}

## Ficheros de configuración local

Este repositorio no debería versionar ficheros locales propios del entorno de desarrollo, como los de configuración de Eclipse. Por ello, se recomienda ignorar en Git elementos como:

- `.project`
- `.classpath`
- `.settings/`

## Uso docente

Este repositorio tiene una finalidad exclusivamente docente dentro de la asignatura **Programación II**. Su contenido puede ampliarse, reorganizarse o actualizarse a lo largo del curso en función de las necesidades de la docencia.

## Autoría

Material docente de la asignatura **Programación II**  
**Facultad de Ingeniería · Universidad de Deusto**  
Curso **2025-2026**
