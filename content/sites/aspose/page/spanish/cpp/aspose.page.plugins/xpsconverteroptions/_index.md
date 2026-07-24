---
title: "Aspose::Page::Plugins::XpsConverterOptions clase"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::Plugins::XpsConverterOptions clase. Representa opciones para el plugin XpsConverter en C++."
type: docs
weight: 2000
url: /es/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Representa opciones para el plugin [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Agrega una nueva fuente de datos a la colección de datos del plugin [XpsConverter](../xpsconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Agrega una nueva fuente de datos a la colección de datos del plugin [XpsConverterOptions](./). |
| [get_DataCollection](./get_datacollection/)() override | Devuelve la colección de datos del plugin [XpsConverterOptions](./). |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad. |
| virtual [get_OperationName](./get_operationname/)() | Devuelve el nombre de la operación. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Obtiene la colección de objetivos añadidos para guardar los resultados de la operación. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad. |
## Ver también

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
