---
title: ConvertFdfToXml
second_title: Aspose.PDF per .NET API Reference
description: Converti file FDF in XML.
type: docs
weight: 120
url: /it/net/aspose.pdf.facades/formdataconverter/convertfdftoxml/
---
## FormDataConverter.ConvertFdfToXml method

Converti file FDF in XML.

```csharp
public static void ConvertFdfToXml(Stream sourceFdf, Stream destXml)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sourceFdf | Stream | Stream che contiene FDF da convertire. |
| destXml | Stream | Sorgente in cui verrà posizionato reuslt XML. |

### Esempi

```csharp
src = new FileStream("test.fdf", FileMode.Open);
dest = new FileStream("converted_fdf.xml", FileMode.Create);
FormDataConverter.ConvertFdfToXml(src, dest);
src.Close();
dest.Close();
```

### Guarda anche

* class [FormDataConverter](../../formdataconverter)
* spazio dei nomi [Aspose.Pdf.Facades](../../formdataconverter)
* assemblea [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
