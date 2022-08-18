---
title: Cylinder
second_title: Referencia de API de Aspose.3D para .NET
description: Cilindro parametrizado. También se puede utilizar para representar el cono cuando uno de radiusTop/radiusBottom es cero.
type: docs
weight: 310
url: /es/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Cilindro parametrizado. También se puede utilizar para representar el cono cuando uno de radiusTop/radiusBottom es cero.

```csharp
public class Cylinder : Primitive
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Cylinder](cylinder#constructor)() | Inicializa una nueva instancia del[`Cylinder`](../cylinder) clase. |
| [Cylinder](cylinder#constructor_1)(double, double) | Inicializa una nueva instancia del[`Cylinder`](../cylinder) clase. |
| [Cylinder](cylinder#constructor_2)(double, double, double) | Inicializa una nueva instancia del[`Cylinder`](../cylinder) clase. |
| [Cylinder](cylinder#constructor_3)(double, double, double, int, int, bool) | Inicializa una nueva instancia del[`Cylinder`](../cylinder) clase. |
| [Cylinder](cylinder#constructor_4)(string, double, double, double, int, int, bool, double, double) | Inicializa una nueva instancia del[`Cylinder`](../cylinder) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows) { get; set; } | Obtiene o establece si esta geometría puede proyectar shadow |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtiene o establece si se excluye esta entidad durante la exportación. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder) { get; set; } | Obtiene o establece si generar el cilindro estilo ventilador cuando ThetaLength es inferior a 2*PI; de lo contrario, el modelo no se cortará. |
| [Height](../../aspose.threed.entities/cylinder/height) { get; set; } | Obtiene o establece la altura del cilindro. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments) { get; set; } | Obtiene o establece los segmentos de altura. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom) { get; set; } | Obtiene o establece el desplazamiento de transformación de vértices del lado inferior. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop) { get; set; } | Obtiene o establece el desplazamiento de transformación de vértices del lado superior. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended) { get; set; } | Obtiene o establece un valor que indica si este[`Cylinder`](../cylinder) abierto. El valor predeterminado es falso. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtiene o establece el primer nodo principal; si se establece el primer nodo principal, esta entidad se separará de otros nodos principales. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtiene todos los nodos principales, una entidad se puede adjuntar a varios nodos principales para crear instancias de geometría |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments) { get; set; } | Obtiene o establece los segmentos radiales. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom) { get; set; } | Obtiene o establece el radio de la tapa inferior del cilindro. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop) { get; set; } | Obtiene o establece el radio de la tapa superior del cilindro. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows) { get; set; } | Obtiene o establece si esta geometría puede recibir shadow. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom) { get; set; } | Obtiene o establece la transformación de corte del lado inferior, el vector almacena el valor de corte (eje x, eje z) que se mide en radianes, el valor predeterminado es (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop) { get; set; } | Obtiene o establece la transformación de corte del lado superior, el vector almacena el valor de corte (eje x, eje z) que se mide en radianes, el valor predeterminado es (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength) { get; set; } | Obtiene o establece la longitud de theta. El valor predeterminado es 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart) { get; set; } | Obtiene o establece el inicio theta. El valor predeterminado es 0. |

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
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh)() | Convertir objeto actual a mesh |

### Ver también

* class [Primitive](../primitive)
* espacio de nombres [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
