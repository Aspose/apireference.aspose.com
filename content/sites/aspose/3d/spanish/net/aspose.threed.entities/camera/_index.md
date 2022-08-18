---
title: Camera
second_title: Referencia de API de Aspose.3D para .NET
description: La cámara describe el punto de vista del espectador que mira la escena.
type: docs
weight: 250
url: /es/net/aspose.threed.entities/camera/
---
## Camera class

La cámara describe el punto de vista del espectador que mira la escena.

```csharp
public class Camera : Frustum
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Camera](camera#constructor)() | Inicializa una nueva instancia del[`Camera`](../camera) clase. |
| [Camera](camera#constructor_1)(ProjectionType) | Inicializa una nueva instancia del[`Camera`](../camera) clase. |
| [Camera](camera#constructor_2)(string) | Inicializa una nueva instancia del[`Camera`](../camera) clase. |
| [Camera](camera#constructor_3)(string, ProjectionType) | Inicializa una nueva instancia del[`Camera`](../camera) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | Obtiene o establece el modo de apertura de la cámara |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Obtiene o establece la relación de aspecto del frustum |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | Obtiene o establece la relación de aspecto del plano de vista. |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Obtiene o establece la dirección en la que mira la cámara. Los cambios en esta propiedad también afectarán la[`LookAt`](../frustum/lookat) y[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtiene o establece si se excluye esta entidad durante la exportación. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Obtiene o establece la distancia del plano lejano del frustum. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | Obtiene o establece el campo de visión de la cámara en grados, esta propiedad se usa solo cuando ApertureMode estáHorizontal oVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | Obtiene o establece el campo de visión horizontal de la cámara en grados, esta propiedad se usa solo cuando ApertureMode estáHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | Obtiene o establece el campo de visión vertical de la cámara en grados, esta propiedad se usa solo cuando ApertureMode estáHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | Obtiene o establece la altura del plano de vista medida en pulgadas |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Obtiene o establece la posición interesada que mira la cámara. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | Obtiene o establece la ampliación utilizada en la cámara ortográfica |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Obtiene o establece la distancia del plano cercano del tronco. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Obtiene o establece la altura cuando frustum en proyección ortográfica. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtiene o establece el primer nodo principal; si se establece el primer nodo principal, esta entidad se separará de otros nodos principales. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtiene todos los nodos principales, una entidad se puede adjuntar a varios nodos principales para crear instancias de geometría |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | Obtiene o establece el tipo de proyección de la cámara. Por defecto se utiliza la proyección en perspectiva. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Obtiene o establece el modo de orientación del frustum Esta propiedad solo funciona cuando el[`Target`](../frustum/target) es nulo. Si el valor esFixedTarget , la dirección siempre se calcula por la propiedad[`LookAt`](../frustum/lookat) De lo contrario, el[`LookAt`](../frustum/lookat)siempre se calcula por[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Obtiene o establece el objetivo que mira la cámara. Si el usuario admite esta propiedad, debe ser anterior a[`LookAt`](../frustum/lookat) propiedad. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Obtiene o establece la dirección hacia arriba de la cámara |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | Obtiene o establece el ancho del plano de vista medido en pulgadas |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtiene el cuadro delimitador de la entidad actual en su sistema de coordenadas de espacio de objetos. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtiene la clave del renderizador de entidades registrado en el renderizador |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | Mueve la cámara hacia adelante hacia su dirección u objetivo. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |

### Ver también

* class [Frustum](../frustum)
* espacio de nombres [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
