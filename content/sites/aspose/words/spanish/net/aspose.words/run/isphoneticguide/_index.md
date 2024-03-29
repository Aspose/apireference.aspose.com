---
title: Run.IsPhoneticGuide
linktitle: IsPhoneticGuide
articleTitle: IsPhoneticGuide
second_title: Aspose.Words para .NET
description: Run IsPhoneticGuide propiedad. Obtiene un valor booleano que indica que la ejecución es una guía fonética en C#.
type: docs
weight: 20
url: /es/net/aspose.words/run/isphoneticguide/
---
## Run.IsPhoneticGuide property

Obtiene un valor booleano que indica que la ejecución es una guía fonética.

```csharp
public bool IsPhoneticGuide { get; }
```

## Ejemplos

Muestra cómo obtener propiedades de la guía fonética.

```csharp
Document doc = new Document(MyDir + "Phonetic guide.docx");            

RunCollection runs = doc.FirstSection.Body.FirstParagraph.Runs;
// Utiliza guía fonética en el texto asiático.
Assert.AreEqual(true, runs[0].IsPhoneticGuide);
Assert.AreEqual("base", runs[0].PhoneticGuide.BaseText);
Assert.AreEqual("ruby", runs[0].PhoneticGuide.RubyText);
```

### Ver también

* class [Run](../)
* espacio de nombres [Aspose.Words](../../../aspose.words/)
* asamblea [Aspose.Words](../../../)
