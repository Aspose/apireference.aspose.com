---
title: Add
second_title: Справочник по API Aspose.Slides для .NET
description: Добавляет подпись в конце коллекции.
type: docs
weight: 20
url: /ru/net/aspose.slides/idigitalsignaturecollection/add/
---
## IDigitalSignatureCollection.Add method

Добавляет подпись в конце коллекции.

```csharp
public void Add(IDigitalSignature digitalSignature)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| digitalSignature | IDigitalSignature | Подпись для добавления. |

### Примеры

```csharp
[C#]
using (Presentation pres = new Presentation())
{
    DigitalSignature signature = new DigitalSignature("testsignature1.pfx", @"testpass1");
    signature.Comments = "Aspose.Slides digital signing test.";
    pres.DigitalSignatures.Add(signature);
    pres.Save("SomePresentationSigned.pptx", SaveFormat.Pptx);
}
```

### Смотрите также

* interface [IDigitalSignature](../../idigitalsignature)
* interface [IDigitalSignatureCollection](../../idigitalsignaturecollection)
* пространство имен [Aspose.Slides](../../idigitalsignaturecollection)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
