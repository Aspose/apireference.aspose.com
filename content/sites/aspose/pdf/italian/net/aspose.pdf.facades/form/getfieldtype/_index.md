---
title: GetFieldType
second_title: Aspose.PDF per .NET API Reference
description: Restituisce il tipo di campo.
type: docs
weight: 270
url: /it/net/aspose.pdf.facades/form/getfieldtype/
---
## Form.GetFieldType method

Restituisce il tipo di campo.

```csharp
public FieldType GetFieldType(string fieldName)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fieldName | String | Nome campo. |

### Valore di ritorno

Elemento dell'enumerazione FileType corrispondente al tipo di campo.

### Esempi

```csharp
Form form = new Form("PdfForm.pdf");
if (form.GetFieldType("textField") == FieldType.Text)
{
   Console.WriteLine("Type of field is text");
}
```

### Guarda anche

* enum [FieldType](../../fieldtype)
* class [Form](../../form)
* spazio dei nomi [Aspose.Pdf.Facades](../../form)
* assemblea [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
