---
title: Class XbrlInstance
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Xbrl.XbrlInstance kelas. Instance XBRL adalah fragmen XML dengan elemen root yang memiliki tag xbrl. Contoh XBRL berisi fakta laporan bisnis dengan setiap fakta terkait dengan aConcept didefinisikan dalam DTS pendukungnya. Instance XBRL juga berisi konteks dan unit yang memberikan informasi tambahan yang diperlukan untuk menginterpretasikan fakta di dalam instance.
type: docs
weight: 8250
url: /id/net/aspose.finance.xbrl/xbrlinstance/
---
## XbrlInstance class

Instance XBRL adalah fragmen XML dengan elemen root yang memiliki tag xbrl. Contoh XBRL berisi fakta laporan bisnis, dengan setiap fakta terkait dengan a[`Concept`](../concept/) didefinisikan dalam DTS pendukungnya. Instance XBRL juga berisi konteks dan unit yang memberikan informasi tambahan yang diperlukan untuk menginterpretasikan fakta di dalam instance.

```csharp
public class XbrlInstance
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl/xbrlinstance/arcrolereferences/) { get; set; } | Mendapat atau menyetel koleksi dari[`ArcroleReference`](../arcrolereference/) objek dalam instance XBRL. |
| [Contexts](../../aspose.finance.xbrl/xbrlinstance/contexts/) { get; set; } | Mendapat atau menyetel koleksi dari[`Context`](../context/) objek dalam instance XBRL. |
| [Facts](../../aspose.finance.xbrl/xbrlinstance/facts/) { get; } | Mendapat koleksi[`Fact`](../fact/) objek dalam instance XBRL. |
| [FootnoteLinks](../../aspose.finance.xbrl/xbrlinstance/footnotelinks/) { get; set; } | Mendapat atau menyetel koleksi dari[`FootnoteLink`](../footnotelink/) objek dalam instance XBRL. |
| [Items](../../aspose.finance.xbrl/xbrlinstance/items/) { get; } | Mendapat koleksi[`Item`](../item/) objek dalam instance XBRL. |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/xbrlinstance/linkbaserefcollection/) { get; } | Mendapatkan[`LinkbaseRefCollection`](./linkbaserefcollection/) dalam`XbrlInstance` . |
| [RoleReferences](../../aspose.finance.xbrl/xbrlinstance/rolereferences/) { get; set; } | Mendapat atau menyetel koleksi dari[`RoleReference`](../rolereference/) objek dalam instance XBRL. |
| [SchemaLocation](../../aspose.finance.xbrl/xbrlinstance/schemalocation/) { get; set; } | Mendapat atau menyetel lokasi skema |
| [SchemaRefs](../../aspose.finance.xbrl/xbrlinstance/schemarefs/) { get; } | Mendapat koleksi SchemaRef. |
| [Units](../../aspose.finance.xbrl/xbrlinstance/units/) { get; set; } | Mendapat atau menyetel koleksi dari[`Unit`](../unit/) objek dalam instance XBRL. |
| [ValidationErrors](../../aspose.finance.xbrl/xbrlinstance/validationerrors/) { get; } | Mendapat kumpulan kesalahan validasi. |
| [XbrlDocument](../../aspose.finance.xbrl/xbrlinstance/xbrldocument/) { get; } | Dapatkan[`XbrlDocument`](./xbrldocument/) yang berisi instance. ini |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CreateElement](../../aspose.finance.xbrl/xbrlinstance/createelement/)(string, string, string) | Buat elemen baru. |
| [GetAllLinkbaseRefCollections](../../aspose.finance.xbrl/xbrlinstance/getalllinkbaserefcollections/)() | Dapatkan semua koleksi referensi linkbase dalam instance xbrl dan referensi skema. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getarcroletypebyuri/)(string) | Mendapat ArcroleType yang memiliki uri. yang ditentukan |
| [GetConceptById](../../aspose.finance.xbrl/xbrlinstance/getconceptbyid/)(string) | Mendapat konsep yang memiliki id yang ditentukan. |
| [GetConceptByLoc](../../aspose.finance.xbrl/xbrlinstance/getconceptbyloc/)(Loc) | Mendapat konsep dari locator. |
| [GetConceptByName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyname/)(string) | Mendapat konsep yang memiliki nama tertentu. |
| [GetConceptByUriAndName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyuriandname/)(string, string) | Mendapat konsep yang memiliki uri dan nama yang ditentukan. |
| [GetContextById](../../aspose.finance.xbrl/xbrlinstance/getcontextbyid/)(string) | Mendapat konteks yang memiliki id yang ditentukan. |
| [GetPresentationLinks](../../aspose.finance.xbrl/xbrlinstance/getpresentationlinks/)(string, string) | Mendapat tautan presentasi dalam contoh xbrl. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getroletypebyuri/)(string) | Mendapat RoleType yang memiliki uri. yang ditentukan |
| [GetUnitById](../../aspose.finance.xbrl/xbrlinstance/getunitbyid/)(string) | Mendapat unit yang memiliki id yang ditentukan. |
| [IsValid](../../aspose.finance.xbrl/xbrlinstance/isvalid/)() | Memeriksa apakah instance XBRL ini valid. |
| [Validate](../../aspose.finance.xbrl/xbrlinstance/validate/)() | Memvalidasi instance XBRL ini. |

### Lihat juga

* ruang nama [Aspose.Finance.Xbrl](../../aspose.finance.xbrl/)
* perakitan [Aspose.Finance](../../)


