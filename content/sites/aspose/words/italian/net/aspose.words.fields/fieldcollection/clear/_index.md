---
title: FieldCollection.Clear
linktitle: Clear
articleTitle: Clear
second_title: Aspose.Words per .NET
description: FieldCollection Clear metodo. Rimuove tutti i campi di questa raccolta dal documento e da questa raccolta stessa in C#.
type: docs
weight: 30
url: /it/net/aspose.words.fields/fieldcollection/clear/
---
## FieldCollection.Clear method

Rimuove tutti i campi di questa raccolta dal documento e da questa raccolta stessa.

```csharp
public void Clear()
```

## Esempi

Mostra come rimuovere i campi da una raccolta di campi.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertField(" DATE \\@ \"dddd, d MMMM yyyy\" ");
builder.InsertField(" TIME ");
builder.InsertField(" REVNUM ");
builder.InsertField(" AUTHOR  \"John Doe\" ");
builder.InsertField(" SUBJECT \"My Subject\" ");
builder.InsertField(" QUOTE \"Hello world!\" ");
doc.UpdateFields();

FieldCollection fields = doc.Range.Fields;

Assert.AreEqual(6, fields.Count);

// Di seguito sono riportati quattro modi per rimuovere i campi da una raccolta di campi.
// 1 - Ottieni un campo per rimuoversi:
fields[0].Remove();
Assert.AreEqual(5, fields.Count);

// 2 - Ottieni la raccolta per rimuovere un campo che passiamo al suo metodo di rimozione:
Field lastField = fields[3];
fields.Remove(lastField);
Assert.AreEqual(4, fields.Count);

// 3 - Rimuove un campo da una raccolta in un indice:
fields.RemoveAt(2);
Assert.AreEqual(3, fields.Count);

// 4 - Rimuovi tutti i campi dalla raccolta contemporaneamente:
fields.Clear();
Assert.AreEqual(0, fields.Count);
```

### Guarda anche

* class [FieldCollection](../)
* spazio dei nomi [Aspose.Words.Fields](../../../aspose.words.fields/)
* assemblea [Aspose.Words](../../../)
