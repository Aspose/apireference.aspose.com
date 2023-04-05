---
title: Class XmpMetadata
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.EPS.XMP.XmpMetadata klass. Ger tillgång till XMPmetadataström.
type: docs
weight: 190
url: /sv/net/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class

Ger tillgång till XMP-metadataström.

```csharp
public sealed class XmpMetadata : IDictionary<string, XmpValue>
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Count](../../aspose.page.eps.xmp/xmpmetadata/count/) { get; } | Får antalet element i samlingen. |
| [IsFixedSize](../../aspose.page.eps.xmp/xmpmetadata/isfixedsize/) { get; } | Kontrollerar om samlingen har fast storlek. |
| [IsReadOnly](../../aspose.page.eps.xmp/xmpmetadata/isreadonly/) { get; } | Kontrollerar om insamlingen är skrivskyddad. |
| [IsSynchronized](../../aspose.page.eps.xmp/xmpmetadata/issynchronized/) { get; } | Kontrollerar om insamlingen är synkroniserad. |
| [Item](../../aspose.page.eps.xmp/xmpmetadata/item/) { get; set; } | Hämtar eller ställer in data från metadata. |
| [Keys](../../aspose.page.eps.xmp/xmpmetadata/keys/) { get; } | Hämtar insamling av metadatanycklar. |
| [NamespaceManager](../../aspose.page.eps.xmp/xmpmetadata/namespacemanager/) { get; } | Får namnområdeshanterare. |
| [SyncRoot](../../aspose.page.eps.xmp/xmpmetadata/syncroot/) { get; } | Hämtar samlingssynkroniseringsobjekt. |
| [Values](../../aspose.page.eps.xmp/xmpmetadata/values/) { get; } | Hämtar värden i metadata. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add)(KeyValuePair&lt;string, XmpValue&gt;) | Lägger till par med nyckel och värde i ordboken. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_2)(string, object) | Lägger till värde till metadata. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_1)(string, XmpValue) | Lägger till värde till metadata. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem)(string, XmpValue) | Lägger till värde till en array. Värdet kommer att läggas till i slutet av arrayen. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem_1)(string, int, XmpValue) | Lägger till värde i en array genom angivet index. |
| [AddNamedValue](../../aspose.page.eps.xmp/xmpmetadata/addnamedvalue/)(string, string, XmpValue) | Lägger till namngett värde i en struktur. |
| [Clear](../../aspose.page.eps.xmp/xmpmetadata/clear/)() | Rensar metadata. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains)(KeyValuePair&lt;string, XmpValue&gt;) | Kontrollerar om det specificerade nyckel-värdeparet finns i ordboken. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains_1)(string) | Kontrollerar om nyckeln finns i metadata. |
| [ContainsKey](../../aspose.page.eps.xmp/xmpmetadata/containskey/)(string) | Bestämmer om denna ordbok innehåller specificerad nyckel. |
| [CopyTo](../../aspose.page.eps.xmp/xmpmetadata/copyto/)(KeyValuePair&lt;string, XmpValue&gt;[], int) | Kopierar element i samlingen till array. |
| [GetEnumerator](../../aspose.page.eps.xmp/xmpmetadata/getenumerator/)() | Returnerar ordboksuppräkning. |
| [GetNamespaceUriByPrefix](../../aspose.page.eps.xmp/xmpmetadata/getnamespaceuribyprefix/)(string) | Returnerar namnutrymmes-URI med prefix. |
| [GetPrefixByNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/getprefixbynamespaceuri/)(string) | Returnerar prefix efter namnutrymmes-URI. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri)(string, string) | Registrerar namnutrymmes-URI. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri_1)(string, string, string) | Registrerar namnutrymmes-URI. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove)(KeyValuePair&lt;string, XmpValue&gt;) | Tar bort nyckel/värdepar från samlingen. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove_1)(string) | Tar bort post från metadata. |
| [SetArrayItem](../../aspose.page.eps.xmp/xmpmetadata/setarrayitem/)(string, int, XmpValue) | Anger värde i en array. Tidigare värde kommer att ersättas med nytt. |
| [SetNamedValue](../../aspose.page.eps.xmp/xmpmetadata/setnamedvalue/)(string, string, XmpValue) | Sätter namngivna värden i en struktur. Det tidigare namngivna värdet, om det redan finns, kommer att ersättas med ett nytt. |
| [TryGetValue](../../aspose.page.eps.xmp/xmpmetadata/trygetvalue/)(string, out XmpValue) | Försöker hitta nyckeln i ordboken och hämtar värde om det hittas. |

### Se även

* class [XmpValue](../xmpvalue/)
* namnutrymme [Aspose.Page.EPS.XMP](../../aspose.page.eps.xmp/)
* hopsättning [Aspose.Page](../../)


