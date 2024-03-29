---
title: DropDownItemCollection.IndexOf
linktitle: IndexOf
articleTitle: IndexOf
second_title: Aspose.Words för .NET
description: DropDownItemCollection IndexOf metod. Returnerar det nollbaserade indexet för det angivna värdet i samlingen i C#.
type: docs
weight: 70
url: /sv/net/aspose.words.fields/dropdownitemcollection/indexof/
---
## DropDownItemCollection.IndexOf method

Returnerar det nollbaserade indexet för det angivna värdet i samlingen.

```csharp
public int IndexOf(string value)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | String | Det skiftlägeskänsliga värdet som ska hittas. |

### Returvärde

Det nollbaserade indexet. Negativt värde om det inte hittas.

## Exempel

Visar hur man infogar ett kombinationsrutafält och redigerar elementen i dess objektsamling.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Infoga en kombinationsruta och verifiera sedan dess samling av listruta.
// I Microsoft Word klickar användaren på kombinationsrutan,
// och välj sedan ett av textobjekten i samlingen att visa.
string[] items = { "One", "Two", "Three" };
FormField comboBoxField = builder.InsertComboBox("DropDown", items, 0);
DropDownItemCollection dropDownItems = comboBoxField.DropDownItems;

Assert.AreEqual(3, dropDownItems.Count);
Assert.AreEqual("One", dropDownItems[0]);
Assert.AreEqual(1, dropDownItems.IndexOf("Two"));
Assert.IsTrue(dropDownItems.Contains("Three"));

// Det finns två sätt att lägga till ett nytt objekt till en befintlig samling av rullgardinsobjekt.
// 1 - Lägg till ett föremål i slutet av samlingen:
dropDownItems.Add("Four");

// 2 - Infoga ett objekt före ett annat objekt vid ett specificerat index:
dropDownItems.Insert(3, "Three and a half");

Assert.AreEqual(5, dropDownItems.Count);

// Iterera över samlingen och skriv ut varje element.
using (IEnumerator<string> dropDownCollectionEnumerator = dropDownItems.GetEnumerator())
    while (dropDownCollectionEnumerator.MoveNext())
        Console.WriteLine(dropDownCollectionEnumerator.Current);

// Det finns två sätt att ta bort element från en samling rullgardinsobjekt.
// 1 - Ta bort ett objekt med innehåll lika med den skickade strängen:
dropDownItems.Remove("Four");

// 2 - Ta bort ett objekt i ett index:
dropDownItems.RemoveAt(3);

Assert.AreEqual(3, dropDownItems.Count);
Assert.IsFalse(dropDownItems.Contains("Three and a half"));
Assert.IsFalse(dropDownItems.Contains("Four"));

doc.Save(ArtifactsDir + "FormFields.DropDownItemCollection.html");

// Töm hela samlingen av rullgardinsobjekt.
dropDownItems.Clear();
```

### Se även

* class [DropDownItemCollection](../)
* namnutrymme [Aspose.Words.Fields](../../../aspose.words.fields/)
* hopsättning [Aspose.Words](../../../)
