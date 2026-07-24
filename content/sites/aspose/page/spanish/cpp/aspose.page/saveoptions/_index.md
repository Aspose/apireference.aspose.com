---
title: "Aspose::Page::SaveOptions clase"
linktitle: "SaveOptions"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::SaveOptions clase. Esta clase contiene opciones necesarias para gestionar el proceso de conversión en C++."
type: docs
weight: 1500
url: /es/cpp/aspose.page/saveoptions/
---
## SaveOptions class


Esta clase contiene opciones necesarias para gestionar el proceso de conversión.

```cpp
class SaveOptions : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Especifica carpetas adicionales donde el conversor debe buscar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta estándar de fuentes donde el SO encuentra fuentes para necesidades internas. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | Especifica si se guardan las fuentes no TrueType en TTF. Reduce significativamente el volumen del documento resultante en la conversión de PS a PDF y aumenta la velocidad de conversión de archivos PS con una gran cantidad de texto en fuentes no TrueType a cualquier formato de salida. Sin embargo, hay un pequeño desplazamiento vertical del texto al convertir un archivo PostScript a imagen. |
| virtual [get_Debug](./get_debug/)() | Especifica si la información de depuración debe imprimirse en el flujo de salida estándar o no. |
| virtual [get_Exceptions](./get_exceptions/)() | Devuelve una lista de errores de conversión suprimidos si [SuppressErrors](../) es verdadero. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad. |
| [get_Size](./get_size/)() const | Obtiene/establece el tamaño de la imagen. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Especifica si los errores deben suprimirse o no. Si es verdadero, los errores suprimidos se añaden a la lista de [Exceptions](../). Si es falso, el primer error terminará el programa. |
| [SaveOptions](./saveoptions/)() | Inicializa una nueva instancia de la clase [SaveOptions](./) con valores predeterminados para los indicadores [SuppressErrors](../) (true) y [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | Inicializa una nueva instancia de la clase [SaveOptions](./) con el valor predeterminado para el indicador [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Inicializa una nueva instancia de [SaveOptions](./) con el tamaño de página especificado. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Inicializa una nueva instancia de la clase [SaveOptions](./) con el valor predeterminado para el indicador [Debug](../) (false) y con el tamaño de página especificado. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Especifica carpetas adicionales donde el conversor debe buscar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta estándar de fuentes donde el SO encuentra fuentes para necesidades internas. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | Especifica si se guardan las fuentes no TrueType en TTF. Reduce significativamente el volumen del documento resultante en la conversión de PS a PDF y aumenta la velocidad de conversión de archivos PS con una gran cantidad de texto en fuentes no TrueType a cualquier formato de salida. Sin embargo, hay un pequeño desplazamiento vertical del texto al convertir un archivo PostScript a imagen. |
| virtual [set_Debug](./set_debug/)(bool) | Especifica si la información de depuración debe imprimirse en el flujo de salida estándar o no. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La categoría Calidad especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Obtiene/establece el tamaño de la imagen. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Especifica si los errores deben suprimirse o no. Si es verdadero, los errores suprimidos se añaden a la lista de [Exceptions](../). Si es falso, el primer error terminará el programa. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
