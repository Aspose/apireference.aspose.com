---
title: IsSameSetting
second_title: Riferimento alle API di Aspose.Cells per .NET
description: Restituisce se la forma è la stessa.
type: docs
weight: 190
url: /it/net/aspose.cells.drawing/picture/issamesetting/
---
## Picture.IsSameSetting method

Restituisce se la forma è la stessa.

```csharp
public override bool IsSameSetting(object obj)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | Object |  |

### Esempi

```csharp

[C#]
//Creazione di un'istanza di un oggetto cartella di lavoro
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];
//inserisco la prima immagine
int imgIndex1 = worksheet.Pictures.Add(1, 1, "1.png");
//Ottieni l'oggetto immagine inserito
Picture pic1 = worksheet.Pictures[imgIndex1];
//inserisco la seconda foto
int imgIndex2 = worksheet.Pictures.Add(1, 9, "2.jpeg");
//Ottieni l'oggetto immagine inserito
Picture pic2 = worksheet.Pictures[imgIndex2];
if(pic1.IsSameSetting(pic1))
{
    //due oggetti immagine sono gli stessi.
}

if(!pic1.IsSameSetting(pic2))
{
    //due oggetti immagine non sono gli stessi.
}
```

### Guarda anche

* class [Picture](../../picture)
* spazio dei nomi [Aspose.Cells.Drawing](../../picture)
* assemblea [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
