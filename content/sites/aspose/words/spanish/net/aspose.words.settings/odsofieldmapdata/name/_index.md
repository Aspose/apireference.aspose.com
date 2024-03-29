---
title: OdsoFieldMapData.Name
linktitle: Name
articleTitle: Name
second_title: Aspose.Words para .NET
description: OdsoFieldMapData Name propiedad. Especifica el nombre de la columna dentro de una fuente de datos externa para la columna cuyo índice está especificado por elColumnpropiedad. El valor predeterminado es una cadena vacía en C#.
type: docs
weight: 40
url: /es/net/aspose.words.settings/odsofieldmapdata/name/
---
## OdsoFieldMapData.Name property

Especifica el nombre de la columna dentro de una fuente de datos externa para la columna cuyo índice está especificado por el[`Column`](../column/)propiedad. El valor predeterminado es una cadena vacía.

```csharp
public string Name { get; set; }
```

## Ejemplos

Muestra cómo acceder a la colección de datos que asigna columnas de origen de datos para fusionar campos.

```csharp
Document doc = new Document(MyDir + "Odso data.docx");

// Esta colección define cómo una combinación de correspondencia asignará columnas de una fuente de datos
// a los campos predefinidos MERGEFIELD, ADDRESSBLOCK y GREETINGLINE.
OdsoFieldMapDataCollection dataCollection = doc.MailMergeSettings.Odso.FieldMapDatas;
Assert.AreEqual(30, dataCollection.Count);

using (IEnumerator<OdsoFieldMapData> enumerator = dataCollection.GetEnumerator())
{
    int index = 0;
    while (enumerator.MoveNext())
    {
        Console.WriteLine($"Field map data index {index++}, type \"{enumerator.Current.Type}\":");

        Console.WriteLine(
            enumerator.Current.Type != OdsoFieldMappingType.Null
                ? $"\tColumn \"{enumerator.Current.Name}\", number {enumerator.Current.Column} mapped to merge field \"{enumerator.Current.MappedName}\"."
                : "\tNo valid column to field mapping data present.");
    }
}

// Clona los elementos de esta colección.
Assert.AreNotEqual(dataCollection[0], dataCollection[0].Clone());

// Utiliza los elementos del método "RemoveAt" individualmente por índice.
dataCollection.RemoveAt(0);

Assert.AreEqual(29, dataCollection.Count);

// Utilice el método "Borrar" para borrar toda la colección a la vez.
dataCollection.Clear();

Assert.AreEqual(0, dataCollection.Count);
```

### Ver también

* class [OdsoFieldMapData](../)
* espacio de nombres [Aspose.Words.Settings](../../../aspose.words.settings/)
* asamblea [Aspose.Words](../../../)
