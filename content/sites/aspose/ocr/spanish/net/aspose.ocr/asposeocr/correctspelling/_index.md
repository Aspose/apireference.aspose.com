---
title: AsposeOcr.CorrectSpelling
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Corrige texto reemplaza palabras mal escritas.
type: docs
weight: 60
url: /es/net/aspose.ocr/asposeocr/correctspelling/
---
## AsposeOcr.CorrectSpelling method

Corrige texto (reemplaza palabras mal escritas).

```csharp
public string CorrectSpelling(string text, SpellCheckLanguage language = SpellCheckLanguage.Eng, 
    string dictionaryPath = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| text | String | Texto para corregir. |
| language | SpellCheckLanguage | Diccionario a utilizar. |
| dictionaryPath | String | Opcionalmente. Ruta completa al diccionario de usuario (diccionario de frecuencia). Formato de archivo de diccionario: Archivo de texto sin formato en codificación UTF-8. La palabra y la frecuencia de palabra están separadas por espacios o tabulaciones. De manera predeterminada, la palabra se espera en la primera columna y la frecuencia en la segunda columna. Cada palabra- par de frecuencias en una línea separada. Una línea se define como una secuencia de caracteres seguida de un salto de línea ("\n"), un retorno de carro ("\r"), o un retorno de carro seguido inmediatamente por un salto de línea ("\r\n"). Se espera que cada palabra esté en minúsculas. |

### Valor_devuelto

Texto con palabras reemplazadas.

### Ver también

* enum [SpellCheckLanguage](../../../aspose.ocr.spellchecker/spellchecklanguage/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


