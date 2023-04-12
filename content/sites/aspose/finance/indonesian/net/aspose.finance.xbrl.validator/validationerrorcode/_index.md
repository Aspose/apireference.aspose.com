---
title: Enum ValidationErrorCode
second_title: Aspose.Finance untuk Referensi .NET API
description: Aspose.Finance.Xbrl.Validator.ValidationErrorCode enum. Enum kode kesalahan validasi.
type: docs
weight: 8210
url: /id/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Enum kode kesalahan validasi.

```csharp
public enum ValidationErrorCode
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | Jenis SchemaRef HARUS muncul dan HARUS memiliki konten tetap "sederhana". |
| SchemaRefNoHref | `1` | SchemaRef HARUS memiliki atribut href. |
| ContextNoId | `2` | ID konteks HARUS menyertakan atribut id. |
| ContextNoEntity | `3` | Elemen entitas adalah konten wajib dari elemen konteks. |
| ContextEntityNoIdentifier | `4` | Elemen entitas HARUS mengandung elemen pengenal |
| ContextPeriodNoStartTime | `5` | Jenis peroid konteks adalah durasi, tetapi tidak memiliki tanggal mulai. |
| ContextPeriodNoEndTime | `6` | Jenis peroid konteks adalah durasi, tetapi tidak memiliki tanggal akhir. |
| ContextPeriodStartAfterEnd | `7` | Jenis peroid konteks adalah durasi, tetapi tanggal akhir sebelum tanggal mulai. |
| ContextInstantNoTime | `8` | Jenis peroid konteks bersifat instan, tetapi tidak memiliki tanggal instan. |
| ContextScenarioXbrlNamespace | `9` | Skenario konteks tidak dapat memiliki node namespace xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Skenario konteks tidak dapat memiliki elemen dalam grup pengganti untuk elemen yang ditentukan dalam namespace xbrl. |
| ContextScenarioEmpty | `11` | Skenario konteks tidak boleh kosong" |
| ContextSegmentXbrlNamespace | `12` | Segmen konteks tidak boleh memiliki node namespace xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Segmen konteks tidak boleh memiliki elemen dalam grup pengganti untuk elemen yang ditentukan dalam ruang nama xbrl. |
| ContextSegmentEmpty | `14` | Segmen konteks tidak boleh kosong |
| ItemNoContext | `15` | Item harus memiliki konteks. |
| ItemPeroidTypeConflictWithContext | `16` | Item memiliki konflik tipe titik dengan konteks. |
| ItemNumericNoUnit | `17` | Item bersifat numerik dan harus memiliki satuan. |
| MonetaryItemNoSingleUnitMeasure | `18` | Barang berjenis moneter dan harus memiliki satuan ukuran tunggal. |
| MonetaryItemNoISO4217 | `19` | Barang berjenis moneter dan harus memiliki satuan ukuran gaya Iso 4217. |
| ShareItemNoSingleUnitMeasure | `20` | Item adalah tipe share dan harus memiliki ukuran satuan tunggal. |
| ShareItemNoShareUnitMeasure | `21` | Item adalah tipe share dan harus memiliki ukuran unit xbrli:shares. |
| NillItemWithPrecisionOrDecimals | `22` | Item nihil dan tidak boleh presisi atau desimal. |
| FractionItemWithPrecisionOrDecimals | `23` | Item adalah tipe pecahan dan tidak boleh presisi atau desimal. |
| NumericItemWithBothPrecisionAndDecimals | `24` | Item adalah tipe numerik dan tidak boleh memiliki presisi dan desimal. |
| NumericItemWithoutPrecisionOrDecimals | `25` | Item bertipe numerik dan harus presisi atau desimal. |
| NonNumericItemWithPrecisionOrDecimals | `26` | Item bukan tipe numerik dan tidak boleh presisi atau desimal. |
| FootnoteArcFromNotFound | `27` | Busur catatan kaki tidak dapat ditemukan dari Loc. |
| FootnoteArcToNotFound | `28` | Busur catatan kaki tidak dapat ditemukan di catatan kaki. |
| DefinitionArcFromNotFound | `29` | Busur definisi tidak dapat ditemukan dari Loc. |
| DefinitionArcToNotFound | `30` | Busur definisi tidak dapat ditemukan di Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | Arc Definisi Essence-alias memiliki jenis yang berbeda. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Busur Definisi Essence-alias memiliki periodTypes yang berbeda. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Arc Essence-alias Definition memiliki saldo yang berbeda. |
| CalculationArcFromNotFound | `34` | Busur perhitungan tidak dapat ditemukan dari Loc. |
| CalculationArcToNotFound | `35` | Busur perhitungan tidak dapat ditemukan di Loc. |
| CalculationArcZeroWeight | `36` | Busur perhitungan memiliki bobot nol. |
| CalculationArcSummationItemNonNumeric | `37` | Busur perhitungan item penjumlahan memiliki konsep non numerik. |
| CalculationArcIllegalBalancecWeight | `38` | Busur perhitungan item penjumlahan memiliki konsep non numerik. |
| LabelArcFromNotFound | `39` | Busur label tidak dapat ditemukan dari Loc. |
| LabelArcToNotFound | `40` | Busur label tidak dapat ditemukan ke Label. |
| PresentationArcFromNotFound | `41` | Busur presentasi tidak dapat ditemukan dari Loc. |
| PresentationArcToNotFound | `42` | Busur presentasi tidak dapat ditemukan di Loc. |
| PresentationArcPreferredLabelNotFound | `43` | Busur presentasi tidak dapat menemukan label yang disukai. |
| ReferenceArcFromNotFound | `44` | Busur referensi tidak dapat ditemukan dari Loc. |
| ReferenceArcToNotFound | `45` | Busur referensi tidak dapat ditemukan di Referensi. |
| InlineFactMissContext | `46` | Fakta Sebaris tidak dapat menemukan konteks. |
| InlineFactMissUnit | `47` | Fakta Inline tidak dapat menemukan unit. |
| InlineDuplicatedId | `48` | Dokumen Xbrl sebaris telah menggandakan id. |
| InlineRelationshipMissFromRef | `49` | Hubungan sebaris tidak dapat ditemukan dari ref. |
| InlineRelationshipMissToRef | `50` | Hubungan sebaris tidak dapat ditemukan untuk ref. |
| InlineRelationshipIllegalFromRef | `51` | Hubungan sebaris memiliki ilegal dari ref. |
| InlineRelationshipIllegalToRef | `52` | Hubungan sebaris memiliki ilegal untuk ref. |
| InlineContinuationNotMatch | `53` | Kelanjutan Inline memiliki ilegal untuk dicocokkan. |
| InlineFootnoteNotlang | `54` | Inline Footnote tidak memiliki bahasa. |
| InlineFractionIllegalChildElement | `55` | Pecahan Sebaris memiliki elemen turunan ilegal. |
| InlineFractionIllegalAttrbuites | `56` | Pecahan Sebaris memiliki atribut ilegal. |
| InlineFractionIllegalAncestor | `57` | Fraksi Sebaris memiliki Leluhur ilegal. |
| InlineFractionTermNegative | `58` | Pecahan Inline memiliki Suku Negatif. |
| InlineHeaderIllegalAncestor | `59` | Pecahan Inline memiliki tag ilegal. |
| InlineHeaderDisplayNone | `60` | Inline header father div node tidak memiliki gaya "display:none". |
| InlineHeaderIllegalChildElement | `61` | Inline header memiliki lebih dari satu elemen "tersembunyi" atau lebih dari satu elemen "sumber daya". |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction memiliki Ancestor ilegal. |
| InlineNonFractionIllegalChildElement | `63` | Inline nonFraction memiliki Child Element ilegal. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction memiliki Properti ilegal. |
| InlineNonFractionTermNegative | `65` | NonFraction sebaris memiliki Istilah Negatif. |
| InlineTupleIllegalChildElement | `66` | Tuple sebaris memiliki elemen ilegal. |
| InlineContinuationNoId | `67` | Elemen ix:continuation HARUS memiliki atribut id.. |
| InlineContinuationIllegalAncestor | `68` | ix: elemen lanjutan TIDAK HARUS turunan dari elemen ix: tersembunyi. |
| InlineExcludeIllegalAncestor | `69` | Elemen ix:exclude HARUS turunan dari setidaknya satu elemen ix:continuation, ix:footnote, atau ix:nonNumeric. |

### Lihat juga

* ruang nama [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator/)
* perakitan [Aspose.Finance](../../)


