---
title: GetFieldLimit
second_title: Referencia de API de Aspose.PDF para .NET
description: Obtener la limitación del campo de texto.
type: docs
weight: 260
url: /es/net/aspose.pdf.facades/form/getfieldlimit/
---
## Form.GetFieldLimit method

Obtener la limitación del campo de texto.

```csharp
public int GetFieldLimit(string fieldName)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fieldName | String | El nombre de campo calificado. |

### Valor_devuelto

Devuelve el número de limitación de caracteres que se puede rellenar un campo de texto. No se establece, devuelve 0.

### Ejemplos

```csharp
Form form = new Form("PdfForm.pdf");
Console.WriteLine(form.GetFieldLimit("textfieldBox"));
```

### Ver también

* class [Form](../../form)
* espacio de nombres [Aspose.Pdf.Facades](../../form)
* asamblea [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
