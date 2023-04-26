---
title: Class UserProperties
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.UserProperties clase. Clase de propiedad especial que permite establecer propiedades escritas y devolver . También permite buscar la conexión de dos objetos de propiedad predeterminados si este objeto de propiedad no contiene la propiedad.
type: docs
weight: 320
url: /es/net/aspose.page/userproperties/
---
## UserProperties class

Clase de propiedad especial que permite establecer propiedades escritas y devolver . También permite buscar la conexión de dos objetos de propiedad predeterminados si este objeto de propiedad no contiene la propiedad.

```csharp
public class UserProperties : Dictionary<string, object>
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [UserProperties](userproperties/#constructor)() | Inicializa una instancia vacía de la clase UserProperties. |
| [UserProperties](userproperties/#constructor_1)(Dictionary&lt;string, object&gt;) | Inicializa una clase UserProperties con valores predeterminados. |
| [UserProperties](userproperties/#constructor_2)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | Construye UserProperties con una tabla de valores predeterminados y valores predeterminados alternativos, que se buscan en ese orden. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [Properties](../../aspose.page/userproperties/properties/) { set; } | Copia propiedades, incluidos sus valores predeterminados, en este UserProperties |

## Métodos

| Nombre | Descripción |
| --- | --- |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty)(string) | Obtiene el valor de la propiedad de cadena. |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty_1)(string, string) | Obtiene el valor de la propiedad de cadena. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor)(string) | Obtiene el valor de la propiedad de color. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor_1)(string, Color) | Obtiene el valor de la propiedad de color. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble)(string) | Obtiene valor de propiedad doble. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble_1)(string, double) | Obtiene el valor de propiedad doble. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat)(string) | Obtiene el valor de la propiedad float. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat_1)(string, float) | Obtiene el valor de la propiedad flotante. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint)(string) | Obtiene valor de propiedad entero. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint_1)(string, int) | Obtiene el valor de propiedad entero. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins)(string) | Obtiene el valor de la propiedad de los márgenes. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins_1)(string, Margins) | Obtiene el valor de la propiedad de los márgenes. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle)(string) | Obtiene el valor de la propiedad del rectángulo. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle_1)(string, RectangleF) | Obtiene el valor de la propiedad del rectángulo. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize)(string) | Obtiene el valor de la propiedad de tamaño. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize_1)(string, Size) | Obtiene el valor de la propiedad de tamaño. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray)(string) | Obtiene el valor de propiedad de la matriz de cadenas. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray_1)(string, string[]) | Obtiene el valor de propiedad de la matriz de cadenas. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty)(string) | Obtiene el valor de la propiedad booleana. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty_1)(string, bool) | Obtiene el valor de la propiedad booleana. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [PrintProperties](../../aspose.page/userproperties/printproperties/)() |  |
| virtual [PropertyNames](../../aspose.page/userproperties/propertynames/)() | Devuelve los nombres de las propiedades. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(string, bool) | Establece el valor de la propiedad booleana. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(string, Color) | Establece el valor de la propiedad de color. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(string, double) | Establece el valor de propiedad doble. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(string, float) | Establece el valor de la propiedad flotante. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(string, int) | Establece el valor de propiedad entero. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(string, Margins) | Establece el valor de la propiedad de los márgenes. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(string, Rectangle) | Establece el valor de la propiedad del rectángulo. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(string, Size) | Establece el valor de la propiedad de tamaño. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(string, string) | Establece el valor de la propiedad de cadena. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_9)(string, string[]) | Establece el valor de propiedad de la matriz de cadenas. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(Dictionary&lt;string, object&gt;, string, bool) | Establece el valor de la propiedad booleana en la tabla de propiedades especificada. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(Dictionary&lt;string, object&gt;, string, Color) | Establece el valor de la propiedad de color en la tabla de propiedades especificada. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(Dictionary&lt;string, object&gt;, string, double) | Establece el valor de propiedad doble en la tabla de propiedades especificada. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(Dictionary&lt;string, object&gt;, string, float) | Establece el valor de la propiedad flotante en la tabla de propiedades especificada. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(Dictionary&lt;string, object&gt;, string, int) | Establece el valor de propiedad entero en la tabla de propiedades especificada. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | Establece el valor de propiedad de los márgenes en la tabla de propiedades especificada. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(Dictionary&lt;string, object&gt;, string, Rectangle) | Establece el valor de la propiedad del rectángulo en la tabla de propiedades especificada. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(Dictionary&lt;string, object&gt;, string, Size) | Establece el valor de la propiedad de tamaño en la tabla de propiedades especificada. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(Dictionary&lt;string, object&gt;, string, string[]) | Establece el valor de la propiedad de matriz de cadenas en la tabla de propiedades especificada. |

### Ver también

* espacio de nombres [Aspose.Page](../../aspose.page/)
* asamblea [Aspose.Page](../../)


