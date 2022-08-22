---
title: Scene
second_title: Referencia de API de Aspose.3D para .NET
description: Una escena es un objeto de nivel superior que contiene los nodos geometrías materiales texturas animaciones poses subescenas etc. La escena puede tener subescenas actúa como soporte de múltiples documentos en archivos como collada/blender /fbx Se puede acceder a la jerarquía de nodos a través deRootNode./scene/rootnodeLibrary./scene/library se usa para mantener una referencia de objetos no adjuntos durante la serialización como metadatos u objetos personalizados para que pueda usarse como una biblioteca.
type: docs
weight: 2250
url: /es/net/aspose.threed/scene/
---
## Scene class

Una escena es un objeto de nivel superior que contiene los nodos, geometrías, materiales, texturas, animaciones, poses, subescenas, etc. La escena puede tener subescenas, actúa como soporte de múltiples documentos en archivos como collada/blender /fbx Se puede acceder a la jerarquía de nodos a través de[`RootNode`](./rootnode)[`Library`](./library) se usa para mantener una referencia de objetos no adjuntos durante la serialización (como metadatos u objetos personalizados) para que pueda usarse como una biblioteca.

```csharp
public class Scene : SceneObject
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Scene](scene#constructor)() | Inicializa una nueva instancia del[`Scene`](../scene) clase. |
| [Scene](scene#constructor_1)(Entity) | Inicializa una nueva instancia del[`Scene`](../scene) clase con una entidad adjunta a un nuevo nodo. |
| [Scene](scene#constructor_2)(Scene, string) | Inicializa una nueva instancia del[`Scene`](../scene)clase como subescena. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | Obtiene todos[`AnimationClip`](../../aspose.threed.animation/animationclip) definido en la escena. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | Obtiene o establece la información de activos de nivel superior |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | Obtiene o establece el activo[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | Los objetos que no se usan directamente en la jerarquía de la escena se pueden definir en la biblioteca. Esto es útil cuando usa subescenas y coloca componentes reutilizables debajo de las subescenas. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [Poses](../../aspose.threed/scene/poses) { get; } | Obtiene todos[`Pose`](../pose) usado en esta escena. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | Obtiene el nodo raíz de la escena. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | Obtiene todas las sub-escenas |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | Abre la escena desde la ruta dada |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | Abre la escena desde la ruta dada |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | Abre la escena desde la ruta dada usando el formato de archivo especificado. |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | Abre la escena desde la ruta dada usando el formato de archivo especificado. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | Abre la escena de la secuencia dada |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | Abre la escena de una transmisión dada utilizando el formato de archivo especificado. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | Abre la escena de un flujo determinado utilizando la configuración de E/S especificada. |
| [Clear](../../aspose.threed/scene/clear)() | Borra el contenido de la escena y restaura la configuración predeterminada. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | Una función abreviada para crear y registrar el[`AnimationClip`](../../aspose.threed.animation/animationclip) El primero[`AnimationClip`](../../aspose.threed.animation/animationclip) será asignado a la[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | Obtiene un nombre[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [Open](../../aspose.threed/scene/open#open)(Stream) | Abre la escena de la secuencia dada |
| [Open](../../aspose.threed/scene/open#open_4)(string) | Abre la escena desde la ruta dada |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | Abre la escena de la secuencia dada |
| [Open](../../aspose.threed/scene/open#open_8)(string, CancellationToken) | Abre la escena desde la ruta dada |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions) | Abre la escena desde la ruta dada usando el formato de archivo especificado. |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | Abre la escena de una transmisión dada utilizando el formato de archivo especificado. |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | Abre la escena de un flujo determinado utilizando la configuración de E/S especificada. |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | Abre la escena desde la ruta dada usando el formato de archivo especificado. |
| [Open](../../aspose.threed/scene/open#open_7)(string, LoadOptions, CancellationToken) | Abre la escena desde la ruta dada usando el formato de archivo especificado. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | Renderiza la escena en mapa de bits desde la perspectiva de la cámara dada. |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | Renderice la escena en un archivo externo desde la perspectiva de la cámara dada. El tamaño de salida predeterminado es 1024x768 y el formato de salida es png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | Renderiza la escena en mapa de bits desde la perspectiva de la cámara dada. |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | Renderiza la escena en un archivo externo desde la perspectiva de la cámara dada. |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Renderiza la escena en un archivo externo desde la perspectiva de la cámara dada. |
| [Save](../../aspose.threed/scene/save#save_4)(string) | Guarda la escena en la ruta especificada usando el formato de archivo especificado. |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | Guarda la escena para transmitir utilizando el formato de archivo especificado. |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions) | Guarda la escena para transmitir utilizando el formato de archivo especificado. |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat) | Guarda la escena en la ruta especificada usando el formato de archivo especificado. |
| [Save](../../aspose.threed/scene/save#save_7)(string, SaveOptions) | Guarda la escena en la ruta especificada usando el formato de archivo especificado. |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | Guarda la escena para transmitir utilizando el formato de archivo especificado. |
| [Save](../../aspose.threed/scene/save#save_3)(Stream, SaveOptions, CancellationToken) | Guarda la escena para transmitir utilizando el formato de archivo especificado. |
| [Save](../../aspose.threed/scene/save#save_6)(string, FileFormat, CancellationToken) | Guarda la escena en la ruta especificada usando el formato de archivo especificado. |
| [Save](../../aspose.threed/scene/save#save_8)(string, SaveOptions, CancellationToken) | Guarda la escena en la ruta especificada usando el formato de archivo especificado. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |

### Ver también

* class [SceneObject](../sceneobject)
* espacio de nombres [Aspose.ThreeD](../../aspose.threed)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
