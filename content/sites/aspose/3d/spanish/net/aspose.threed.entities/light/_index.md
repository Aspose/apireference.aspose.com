---
title: Light
second_title: Referencia de API de Aspose.3D para .NET
description: La luz ilumina la escena.
type: docs
weight: 400
url: /es/net/aspose.threed.entities/light/
---
## Light class

La luz ilumina la escena.

La fórmula para calcular la atenuación total de la luz es: `A = Atenuación constante + (Dist * Atenuación lineal) + ((Dist^2) * Atenuación cuadrática)`

```csharp
public class Light : Frustum
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Light](light#constructor)() | Inicializa una nueva instancia del[`Light`](../light) clase. |
| [Light](light#constructor_1)(string) | Inicializa una nueva instancia del[`Light`](../light) clase. |
| [Light](light#constructor_2)(string, LightType) | Inicializa una nueva instancia del[`Light`](../light) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Obtiene o establece la relación de aspecto del frustum |
| [CastLight](../../aspose.threed.entities/light/castlight) { get; set; } | Obtiene o establece si la instancia de luz actual puede iluminar otros objetos. |
| [CastShadows](../../aspose.threed.entities/light/castshadows) { get; set; } | Obtiene o establece si la luz puede proyectar sombras sobre otros objetos. |
| [Color](../../aspose.threed.entities/light/color) { get; set; } | Obtiene o establece el color de la luz |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation) { get; set; } | Obtiene o establece la atenuación constante para calcular la atenuación total de la luz |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Obtiene o establece la dirección en la que mira la cámara. Los cambios en esta propiedad también afectarán la[`LookAt`](../frustum/lookat) y[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtiene o establece si se excluye esta entidad durante la exportación. |
| [Falloff](../../aspose.threed.entities/light/falloff) { get; set; } | Obtiene o establece el ángulo del cono de caída (en grados). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Obtiene o establece la distancia del plano lejano del frustum. |
| [HotSpot](../../aspose.threed.entities/light/hotspot) { get; set; } | Obtiene o establece el ángulo del cono del punto caliente (en grados). |
| [Intensity](../../aspose.threed.entities/light/intensity) { get; set; } | Obtiene o establece la intensidad de la luz, el valor predeterminado es 100 |
| [LightType](../../aspose.threed.entities/light/lighttype) { get; set; } | Obtiene o establece el tipo de luz |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation) { get; set; } | Obtiene o establece la atenuación lineal para calcular la atenuación total de la luz |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Obtiene o establece la posición interesada que mira la cámara. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Obtiene o establece la distancia del plano cercano del tronco. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Obtiene o establece la altura cuando frustum en proyección ortográfica. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtiene o establece el primer nodo principal; si se establece el primer nodo principal, esta entidad se separará de otros nodos principales. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtiene todos los nodos principales, una entidad se puede adjuntar a varios nodos principales para crear instancias de geometría |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation) { get; set; } | Obtiene o establece la atenuación cuadrática para calcular la atenuación total de la luz |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Obtiene o establece el modo de orientación del frustum Esta propiedad solo funciona cuando el[`Target`](../frustum/target) es nulo. Si el valor esFixedTarget , la dirección siempre se calcula por la propiedad[`LookAt`](../frustum/lookat) De lo contrario, el[`LookAt`](../frustum/lookat)siempre se calcula por[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor) { get; set; } | Obtiene o establece el color de la sombra. |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Obtiene o establece el objetivo que mira la cámara. Si el usuario admite esta propiedad, debe ser anterior a[`LookAt`](../frustum/lookat) propiedad. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Obtiene o establece la dirección hacia arriba de la cámara |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtiene el cuadro delimitador de la entidad actual en su sistema de coordenadas de espacio de objetos. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtiene la clave del renderizador de entidades registrado en el renderizador |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |

### Ver también

* class [Frustum](../frustum)
* espacio de nombres [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
