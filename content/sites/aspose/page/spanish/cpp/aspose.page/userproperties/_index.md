---
title: "Aspose::Page::UserProperties clase"
linktitle: "UserProperties"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::UserProperties clase. Clase de propiedad especial que permite establecer y devolver propiedades tipadas. También permite la conexión de dos objetos de propiedad predeterminados para ser buscados si este objeto de propiedad no contiene la propiedad en C++."
type: docs
weight: 1600
url: /es/cpp/aspose.page/userproperties/
---
## UserProperties class


Clase de propiedad especial que permite establecer y devolver propiedades tipadas. También permite la conexión de dos objetos de propiedad predeterminados para buscar si este objeto de propiedad no contiene la propiedad.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Obtiene el valor de la propiedad de cadena. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Obtiene el valor de la propiedad de cadena. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Obtiene el valor de la propiedad de color. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Obtiene el valor de la propiedad de color. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Obtiene el valor de la propiedad de doble. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Obtiene el valor de la propiedad de doble. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Obtiene el valor de la propiedad de flotante. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Obtiene el valor de la propiedad de flotante. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Obtiene el valor de la propiedad entera. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Obtiene el valor de la propiedad entera. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Obtiene el valor de la propiedad de márgenes. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Obtiene el valor de la propiedad de márgenes. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Obtiene el valor de la propiedad de matriz. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Obtiene el valor de la propiedad de matriz. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Obtiene el valor de la propiedad de rectángulo. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Obtiene el valor de la propiedad de rectángulo. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Obtiene el valor de la propiedad de tamaño. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Obtiene el valor de la propiedad de tamaño. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Obtiene el valor de la propiedad de matriz de cadenas. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Obtiene el valor de la propiedad de matriz de cadenas. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [IsProperty](./isproperty/)(System::String) | Obtiene el valor de la propiedad booleana. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Obtiene el valor de la propiedad booleana. Si la propiedad solicitada está ausente, devuelve el valor predeterminado proporcionado. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Devuelve los nombres de las propiedades. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Copia las propiedades, incluidos sus valores predeterminados, en este [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Establece el valor de la propiedad de cadena. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Establece el valor de la propiedad de matriz de cadenas. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Establece el valor de la propiedad de matriz de cadenas en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Establece el valor de la propiedad de color. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Establece el valor de la propiedad de color en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Establece el valor de la propiedad de rectángulo. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Establece el valor de la propiedad de rectángulo en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Establece el valor de la propiedad de márgenes. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Establece el valor de la propiedad de márgenes en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Establece el valor de la propiedad de tamaño. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Establece el valor de la propiedad de tamaño en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Establece el valor de la propiedad entera. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Establece el valor de la propiedad entera en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Establece el valor de la propiedad doble. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Establece el valor de la propiedad doble en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Establece el valor de la propiedad flotante. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Establece el valor de la propiedad flotante en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Establece el valor de la propiedad booleana. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Establece el valor de la propiedad booleana en la tabla de propiedades especificada. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Establece el valor de la propiedad de matriz. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Establece el valor de la propiedad de matriz en la tabla de propiedades especificada. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Establece el n‑ésimo argumento de plantilla como un puntero débil (en lugar de compartido). Permite cambiar los punteros en contenedores al modo débil. |
| [UserProperties](./userproperties/)() | Inicializa una instancia vacía de la clase [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Inicializa una instancia de la clase [UserProperties](./) con valores predeterminados. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Construye [UserProperties](./) con una tabla defaults y altDefaults, que se buscan en ese orden. |
## Ver también

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
