---
title: "Aspose::Page::Plugins::PsConverterOptions class"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::Plugins::PsConverterOptions class. Representa las opciones para el plugin PsConverter en C++."
type: docs
weight: 1200
url: /es/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Representa las opciones para el plugin [PsConverter](../psconverter/).

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Añade una nueva fuente de datos a la colección de datos del plugin [PsConverter](../psconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Añade una nueva fuente de datos a la colección de datos del plugin [PsConverterOptions](./). |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Especifica carpetas adicionales donde el conversor debe buscar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta estándar de fuentes donde el SO encuentra fuentes para necesidades internas. |
| [get_DataCollection](./get_datacollection/)() override | Devuelve la colección de datos del plugin [PsConverterOptions](./). |
| virtual [get_Debug](./get_debug/)() | Especifica si la información de depuración debe imprimirse en el flujo de salida estándar o no. |
| virtual [get_Exceptions](./get_exceptions/)() | Devuelve una lista de errores de conversión suprimidos si [SuppressErrors](../) es verdadero. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad. |
| virtual [get_OperationName](./get_operationname/)() | Devuelve el nombre de la operación. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Obtiene la colección de objetivos añadidos para guardar los resultados de la operación. |
| [get_SupressErrors](./get_supresserrors/)() const | Especifica si los errores deben suprimirse o no. Si es verdadero, los errores suprimidos se añaden a la lista de [Exceptions](../). Si es falso, el primer error terminará el programa. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Especifica carpetas adicionales donde el conversor debe buscar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta estándar de fuentes donde el SO encuentra fuentes para necesidades internas. |
| virtual [set_Debug](./set_debug/)(bool) | Especifica si la información de depuración debe imprimirse en el flujo de salida estándar o no. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Devuelve una lista de errores de conversión suprimidos si [SuppressErrors](../) es verdadero. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Especifica si los errores deben suprimirse o no. Si es verdadero, los errores suprimidos se añaden a la lista de [Exceptions](../). Si es falso, el primer error terminará el programa. |
## Ver también

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
