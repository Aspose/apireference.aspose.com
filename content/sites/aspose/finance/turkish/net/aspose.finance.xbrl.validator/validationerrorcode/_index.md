---
title: ValidationErrorCode
second_title: Aspose.Finance for .NET API Referansı
description: Doğrulama hata kodu enum.
type: docs
weight: 8160
url: /tr/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Doğrulama hata kodu enum.

```csharp
public enum ValidationErrorCode
```

### değerler

| İsim | Değer | Tanım |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | SchemaRef türü OLMALIDIR ve "basit" sabit içeriğe sahip OLMALIDIR. |
| SchemaRefNoHref | `1` | SchemaRef'in bir href niteliğine sahip olması ZORUNLUDUR. |
| ContextNoId | `2` | Bağlam kimliği, kimlik özniteliğini İÇERMELİDİR. |
| ContextNoEntity | `3` | Varlık öğesi, bağlam öğesinin gerekli içeriğidir. |
| ContextEntityNoIdentifier | `4` | Varlık öğesi bir tanımlayıcı öğe içermelidir ZORUNLU |
| ContextPeriodNoStartTime | `5` | Bağlam peroid türü süredir, ancak başlangıç tarihi yok. |
| ContextPeriodNoEndTime | `6` | Bağlam peroid türü süredir, ancak bitiş tarihi yoktur. |
| ContextPeriodStartAfterEnd | `7` | Bağlam peroid türü süre, ancak bitiş tarihi başlangıç tarihinden önce. |
| ContextInstantNoTime | `8` | Bağlam peroid türü anlıktır, ancak anlık tarihi yoktur. |
| ContextScenarioXbrlNamespace | `9` | Bağlam senaryosunda xbrl ad alanı düğümü olamaz. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Bağlam senaryosu, xbrl ad alanında tanımlanan öğeler için ikame grubunda öğeye sahip olamaz. |
| ContextScenarioEmpty | `11` | Bağlam senaryosu boş olamaz" |
| ContextSegmentXbrlNamespace | `12` | Bağlam segmenti xbrl ad alanı düğümüne sahip olamaz. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Bağlam segmenti, xbrl ad alanında tanımlanan öğeler için ikame grubunda öğeye sahip olamaz. |
| ContextSegmentEmpty | `14` | Bağlam segmenti boş olamaz |
| ItemNoContext | `15` | Öğenin bir bağlamı olmalıdır. |
| ItemPeroidTypeConflictWithContext | `16` | Öğede bağlamla nokta türü çakışması var. |
| ItemNumericNoUnit | `17` | Öğe sayısaldır ve bir birimi olmalıdır. |
| MonetaryItemNoSingleUnitMeasure | `18` | Öğe parasal türdür ve tek bir birim ölçüsüne sahip olmalıdır. |
| MonetaryItemNoISO4217 | `19` | Öğe parasal türdür ve Iso 4217 stili birim ölçüsüne sahip olmalıdır. |
| ShareItemNoSingleUnitMeasure | `20` | Öğe, paylaşım türüdür ve tek bir birim ölçüsüne sahip olmalıdır. |
| ShareItemNoShareUnitMeasure | `21` | Öğe, paylaşım türüdür ve bir xbrli:shares birim ölçüsüne sahip olmalıdır. |
| NillItemWithPrecisionOrDecimals | `22` | Öğe sıfırdır ve kesinlik veya ondalık sayı içermemelidir. |
| FractionItemWithPrecisionOrDecimals | `23` | Öğe, kesir türündedir ve kesinlik veya ondalık sayı içermemelidir. |
| NumericItemWithBothPrecisionAndDecimals | `24` | Öğe sayısal türdedir ve hem kesinlik hem de ondalık sayı içermemelidir. |
| NumericItemWithoutPrecisionOrDecimals | `25` | Öğe sayısal türdedir ve kesinlik veya ondalık basamaklara sahip olmalıdır. |
| NonNumericItemWithPrecisionOrDecimals | `26` | Öğe sayısal türde değil ve kesinlik veya ondalık sayı içermemelidir. |
| FootnoteArcFromNotFound | `27` | Dipnot yayı Loc. 'den bulamıyor |
| FootnoteArcToNotFound | `28` | Dipnot yayı dipnotu bulamıyor. |
| DefinitionArcFromNotFound | `29` | Tanım yayı Loc. 'den bulamıyor |
| DefinitionArcToNotFound | `30` | Tanım yayı Loc. 'yi bulamıyor |
| EssenceAliasDefinitionArcDifferentType | `31` | Essence-alias Tanım arkının farklı türleri vardır. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Essence-alias Definition arc'ın farklı periodType'ları var. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Essence-alias Tanım yayı farklı dengelere sahiptir. |
| CalculationArcFromNotFound | `34` | Hesaplama yayı Loc. 'den bulamıyor |
| CalculationArcToNotFound | `35` | Hesaplama yayı Loc. 'yi bulamıyor |
| CalculationArcZeroWeight | `36` | Hesaplama eğrisinin ağırlığı sıfırdır. |
| CalculationArcSummationItemNonNumeric | `37` | Toplama öğesi hesaplama yayının sayısal olmayan bir konsepti var. |
| CalculationArcIllegalBalancecWeight | `38` | Toplama öğesi hesaplama yayının sayısal olmayan bir konsepti var. |
| LabelArcFromNotFound | `39` | Etiket yayı Loc. 'den bulamıyor |
| LabelArcToNotFound | `40` | Etiket yayı, Etiketi bulamıyor. |
| PresentationArcFromNotFound | `41` | Sunum yayı Loc. 'den bulamıyor |
| PresentationArcToNotFound | `42` | Sunum yayı Loc. 'yi bulamıyor |
| PresentationArcPreferredLabelNotFound | `43` | Sunum yayı tercih edilen Etiketi bulamıyor. |
| ReferenceArcFromNotFound | `44` | Referans yayı Loc. 'den bulamıyor |
| ReferenceArcToNotFound | `45` | Referans arkı Referansı bulamıyor. |
| InlineFactMissContext | `46` | Satır İçi Gerçek bağlamı bulamıyor. |
| InlineFactMissUnit | `47` | Satır İçi Gerçek, birimi bulamıyor. |
| InlineDuplicatedId | `48` | Satır içi Xbrl belgesinde yinelenen kimlik var. |
| InlineRelationshipMissFromRef | `49` | Satır içi ilişki ref. 'den bulamıyor |
| InlineRelationshipMissToRef | `50` | Satır içi ilişki referansı bulamıyor. |
| InlineRelationshipIllegalFromRef | `51` | ref. 'den gelen satır içi ilişki geçersiz |
| InlineRelationshipIllegalToRef | `52` | Satır içi ilişki, ref. için geçersiz |
| InlineContinuationNotMatch | `53` | Satır İçi Devam'ın eşleşmesi geçersiz. |
| InlineFootnoteNotlang | `54` | Satır İçi Dipnotun dili yok. |
| InlineFractionIllegalChildElement | `55` | Satır İçi Kesirde geçersiz alt öğe var. |
| InlineFractionIllegalAttrbuites | `56` | Satır İçi Kesirde geçersiz nitelikler var. |
| InlineFractionIllegalAncestor | `57` | Satır İçi Kesirde geçersiz Ata var. |
| InlineFractionTermNegative | `58` | Satır İçi Kesirde Terim Negatif Var. |
| InlineHeaderIllegalAncestor | `59` | Satır İçi Kesirde geçersiz etiket var. |
| InlineHeaderDisplayNone | `60` | Satır içi başlık babası div düğümünün "görüntüleme:yok" stili yok. |
| InlineHeaderIllegalChildElement | `61` | Satır içi başlıkta birden fazla "gizli" öğe veya birden fazla "kaynak" öğesi var. |
| InlineNonFractionIllegalAncestor | `62` | Satır içi nonFraction'ın geçersiz Atası var. |
| InlineNonFractionIllegalChildElement | `63` | Satır içi nonFraction'da geçersiz Alt Öğe var. |
| InlineNonFractionIllegalProperties | `64` | Satır içi nonFraction'da geçersiz Özellikler var. |
| InlineNonFractionTermNegative | `65` | Satır içi Kesirsiz, Terim Negatif'e sahip. |
| InlineTupleIllegalChildElement | `66` | Satır içi demet geçersiz öğeye sahip. |
| InlineContinuationNoId | `67` | ix:continuation öğesinin bir id niteliğine sahip olması ZORUNLUDUR.. |
| InlineContinuationIllegalAncestor | `68` | ix:continuation öğesi, bir ix:hidden öğesinin alt öğesi OLMAMALIDIR. |
| InlineExcludeIllegalAncestor | `69` | ix:exclude öğesi en az bir ix:continuation, ix:dipnot veya ix:nonNumeric öğesinin soyundan gelmelidir. |

### Ayrıca bakınız

* ad alanı [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* toplantı [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
