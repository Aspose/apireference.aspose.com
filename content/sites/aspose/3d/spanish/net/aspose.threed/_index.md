---
title: Aspose.ThreeD
second_title: Referencia de API de Aspose.3D para .NET
description: El espacio de nombres base de Aspose.3D
type: docs
weight: 10
url: /es/net/aspose.threed/
---
El espacio de nombres base de Aspose.3D

## Clases

| Clase | Descripción |
| --- | --- |
| [A3DObject](./a3dobject) | La clase base de todos los objetos Aspose.ThreeD, todas las subclases admitirán propiedades dinámicas. |
| [AssetInfo](./assetinfo) | Información del activo. La información del activo se puede adjuntar a un[`Scene`](../aspose.threed/scene) . Niño[`Scene`](../aspose.threed/scene) puede tener su propia[`AssetInfo`](../aspose.threed/assetinfo) para anular la definición de los padres. |
| [BonePose](./bonepose) | El[`BonePose`](../aspose.threed/bonepose) contiene la matriz de transformación para un hueso node |
| [CustomObject](./customobject) | Los metadatos u objetos personalizados utilizados en archivos 3D son administrados por esta clase. Todas las propiedades personalizadas se guardan como propiedades dinámicas. |
| [Entity](./entity) | La clase base de todas las entidades. La entidad representa un objeto concreto que se adjunta bajo un nodo como[`Light`](../aspose.threed.entities/light)/[`Geometry`](../aspose.threed.entities/geometry) . |
| [ExportException](./exportexception) | Excepciones cuando Aspose.3D no pudo exportar la escena al archivo |
| [FileFormat](./fileformat) | Definición de formato de archivo |
| [FileFormatType](./fileformattype) | Tipo de formato de archivo |
| [GlobalTransform](./globaltransform) | La transformación global es similar a[`Transform`](../aspose.threed/transform) pero es inmutable mientras representa la transformación final evaluada. El sistema de coordenadas de la mano derecha se usa al evaluar la transformación global |
| [ImageRenderOptions](./imagerenderoptions) | Opciones para[`Render`](../aspose.threed/scene/render) y[`Render`](../aspose.threed/scene/render) |
| [ImportException](./importexception) | Excepción cuando Aspose.3D no pudo abrir el source especificado |
| [License](./license) | Proporciona métodos para licenciar el componente. |
| [Metered](./metered) | Proporciona métodos para configurar la clave medida. |
| [Node](./node) | Representa un elemento en el escenario gráfico. Un escenario gráfico es un árbol de objetos Nodo. Los servicios de administración de árboles están incluidos en esta clase. Tenga en cuenta que el SDK de Aspose.3D no prueba la validez del escenario gráfico construido. Es responsabilidad de quien llama asegurarse de que no genera gráficos cíclicos en una jerarquía de nodos. Además de la gestión del árbol, esta clase define todas las propiedades necesarias para describir la posición del objeto en la escena. Esta información incluye las propiedades básicas de traslación, rotación y escala y las opciones más avanzadas para pivotes, límites y atributos de juntas IK, como la rigidez y la amortiguación. Cuando se crea por primera vez, el objeto Nodo está "vacío" (es decir, está un objeto sin ninguna representación gráfica que solo contiene la información de posición). En este estado, se puede usar para representar a los padres en la estructura de árbol de nodos, pero no mucho más. El uso normal de este tipo de objetos es agregarles una entidad que especializará el nodo (ver la "Entidad"). La entidad es un objeto en sí mismo y está conectado al Nodo. Esto también significa que la misma entidad se puede compartir entre varios nodos. Camera, Light, Mesh, etc... son todas entidades y todas derivan de la clase base Entity. |
| [NodeVisitor](./nodevisitor) | Una devolución de llamada para viajar a través de toda la jerarquía de nodos. |
| [Pose](./pose) | La pose se usa para almacenar la matriz de transformación cuando la geometría está desollada. La pose es un conjunto de[`BonePose`](../aspose.threed/bonepose) , cada[`BonePose`](../aspose.threed/bonepose) guarda la información de transformación concreta del nodo óseo. |
| [Property](./property) | Clase para contener propiedades definidas por el usuario. |
| [PropertyCollection](./propertycollection) | La colección de propiedades |
| [Scene](./scene) | Una escena es un objeto de nivel superior que contiene los nodos, geometrías, materiales, texturas, animaciones, poses, subescenas, etc. La escena puede tener subescenas, actúa como soporte de múltiples documentos en archivos como collada/blender /fbx Se puede acceder a la jerarquía de nodos a través de[`RootNode`](../aspose.threed/scene/rootnode)[`Library`](../aspose.threed/scene/library) se usa para mantener una referencia de objetos no adjuntos durante la serialización (como metadatos u objetos personalizados) para que pueda usarse como una biblioteca. |
| [SceneObject](./sceneobject) | La clase raíz de objetos que se almacenarán dentro de una escena. |
| [Transform](./transform) | Una transformación contiene información que permite el acceso a la transformación/escala/rotación del objeto o matriz de transformación a un costo mínimo Esto lo utiliza la transformación local. |
| [TrialException](./trialexception) | Esto se genera en Scene.Open/Scene.Save cuando no se aplican licencias. Puede desactivar esta excepción configurando SuppressTrialException en verdadero. |
## Interfaces

| Interfaz | Descripción |
| --- | --- |
| [INamedObject](./inamedobject) | Objeto que tiene nombre |
## Enumeración

| Enumeración | Descripción |
| --- | --- |
| [Axis](./axis) | El eje de coordenadas. |
| [CoordinatedSystem](./coordinatedsystem) | El sistema de coordenadas zurdo o diestro. |
| [FileContentType](./filecontenttype) | Tipo de contenido del archivo |
| [PoseType](./posetype) | Tipo de pose. |
| [PropertyFlags](./propertyflags) | Banderas de propiedad |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
