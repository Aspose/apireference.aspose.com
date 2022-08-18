---
title: Transform
second_title: Referencia de API de Aspose.3D para .NET
description: Una transformación contiene información que permite el acceso a la transformación/escala/rotación del objeto o matriz de transformación a un costo mínimo Esto lo utiliza la transformación local.
type: docs
weight: 2400
url: /es/net/aspose.threed/transform/
---
## Transform class

Una transformación contiene información que permite el acceso a la transformación/escala/rotación del objeto o matriz de transformación a un costo mínimo Esto lo utiliza la transformación local.

```csharp
public class Transform : A3DObject
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles) { get; set; } | Obtiene o establece la rotación representada en ángulos de Euler, medida en grados |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation) { get; set; } | Obtiene o establece la rotación geométrica de Euler (medida en grados). La transformación geométrica solo afecta a las entidades adjuntas y no afecta a los nodos secundarios. Se fusionará como transformación local cuando exporte la transformación geométrica a tipos de archivo que no la admitan. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling) { get; set; } | Obtiene o establece la escala geométrica. La transformación geométrica solo afecta a las entidades adjuntas y no afecta a los nodos secundarios. Se fusionará como transformación local cuando exporte la transformación geométrica a tipos de archivo que no la admitan. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation) { get; set; } | Obtiene o establece la traslación geométrica. La transformación geométrica solo afecta a las entidades adjuntas y no afecta a los nodos secundarios. Se fusionará como transformación local cuando exporte la transformación geométrica a tipos de archivo que no la admitan. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [PostRotation](../../aspose.threed/transform/postrotation) { get; set; } | Obtiene o establece la posrotación representada en grado |
| [PreRotation](../../aspose.threed/transform/prerotation) { get; set; } | Obtiene o establece la rotación previa representada en grado |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [Rotation](../../aspose.threed/transform/rotation) { get; set; } | Obtiene o establece la rotación representada en quaternion. |
| [Scale](../../aspose.threed/transform/scale) { get; set; } | Obtiene o establece la escala |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix) { get; set; } | Obtiene o establece la matriz de transformación. |
| [Translation](../../aspose.threed/transform/translation) { get; set; } | Obtiene o establece la traducción |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles)(double, double, double) | Establece los ángulos de Euler en grados de transformada de corriente. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation)(double, double, double) | Establece la rotación de Euler geométrica (medida en grados). La transformación geométrica solo afecta a las entidades adjuntas y no afecta a los nodos secundarios. Se fusionará como transformación local cuando exporte la transformación geométrica a tipos de archivo que no la admitan. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling)(double, double, double) | Establece la escala geométrica. La transformación geométrica solo afecta a las entidades adjuntas y no afecta a los nodos secundarios. Se fusionará como transformación local cuando exporte la transformación geométrica a tipos de archivo que no la admitan. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation)(double, double, double) | Establece la traslación geométrica. La transformación geométrica solo afecta a las entidades adjuntas y no afecta a los nodos secundarios. Se fusionará como transformación local cuando exporte la transformación geométrica a tipos de archivo que no la admitan. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation)(double, double, double) | Establece la post-rotación representada en grado |
| [SetPreRotation](../../aspose.threed/transform/setprerotation)(double, double, double) | Establece la pre-rotación representada en grado |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |
| [SetRotation](../../aspose.threed/transform/setrotation)(double, double, double, double) | Establece la rotación (como componentes de cuaterniones) de la transformación actual. |
| [SetScale](../../aspose.threed/transform/setscale)(double, double, double) | Establece la escala de la transformada de corriente. |
| [SetTranslation](../../aspose.threed/transform/settranslation)(double, double, double) | Establece la traducción de la transformación actual. |

### Ver también

* class [A3DObject](../a3dobject)
* espacio de nombres [Aspose.ThreeD](../../aspose.threed)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
