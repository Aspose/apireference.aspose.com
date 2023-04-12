---
title: Enum ValidationErrorCode
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Validator.ValidationErrorCode एनुम. सत्यपन त्रुट कड एनम.
type: docs
weight: 8210
url: /hi/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

सत्यापन त्रुटि कोड एनम.

```csharp
public enum ValidationErrorCode
```

### मान

| नाम | कीमत | विवरण |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | SchemaRef प्रकार होना चाहिए और निश्चित सामग्री "सरल" होनी चाहिए। |
| SchemaRefNoHref | `1` | SchemaRef में एक href विशेषता होनी चाहिए। |
| ContextNoId | `2` | संदर्भ आईडी में आईडी विशेषता शामिल होनी चाहिए। |
| ContextNoEntity | `3` | इकाई तत्व संदर्भ तत्व की आवश्यक सामग्री है। |
| ContextEntityNoIdentifier | `4` | इकाई तत्व में एक पहचानकर्ता तत्व होना चाहिए |
| ContextPeriodNoStartTime | `5` | संदर्भ अवधि प्रकार अवधि है, लेकिन इसकी कोई प्रारंभ तिथि नहीं है। |
| ContextPeriodNoEndTime | `6` | संदर्भ अवधि प्रकार अवधि है, लेकिन इसकी कोई समाप्ति तिथि नहीं है। |
| ContextPeriodStartAfterEnd | `7` | संदर्भ अवधि प्रकार अवधि है, लेकिन समाप्ति तिथि प्रारंभ तिथि से पहले है। |
| ContextInstantNoTime | `8` | संदर्भ अवधि प्रकार तत्काल है, लेकिन इसकी कोई तत्काल तिथि नहीं है। |
| ContextScenarioXbrlNamespace | `9` | प्रसंग परिदृश्य में xbrl नामस्थान नोड नहीं हो सकता. |
| ContextScenarioXbrlSubstitutionGroup | `10` | संदर्भ परिदृश्य में xbrl नामस्थान में परिभाषित तत्वों के लिए प्रतिस्थापन समूह में तत्व नहीं हो सकता है। |
| ContextScenarioEmpty | `11` | संदर्भ परिदृश्य खाली नहीं हो सकता" |
| ContextSegmentXbrlNamespace | `12` | प्रसंग खंड में xbrl नामस्थान नोड नहीं हो सकता. |
| ContextSegmentXbrlSubstitutionGroup | `13` | संदर्भ खंड में xbrl नामस्थान में परिभाषित तत्वों के लिए प्रतिस्थापन समूह में तत्व नहीं हो सकता है। |
| ContextSegmentEmpty | `14` | संदर्भ खंड खाली नहीं हो सकता |
| ItemNoContext | `15` | आइटम का संदर्भ होना चाहिए. |
| ItemPeroidTypeConflictWithContext | `16` | आइटम में संदर्भ के साथ अवधि प्रकार विरोध है. |
| ItemNumericNoUnit | `17` | आइटम संख्यात्मक है और इसकी एक इकाई होनी चाहिए। |
| MonetaryItemNoSingleUnitMeasure | `18` | आइटम मौद्रिक प्रकार है और एक इकाई माप होना चाहिए। |
| MonetaryItemNoISO4217 | `19` | आइटम मौद्रिक प्रकार का है और इसमें एक आईएसओ 4217 शैली इकाई माप होना चाहिए। |
| ShareItemNoSingleUnitMeasure | `20` | आइटम शेयर प्रकार का है और इसमें एक इकाई माप होना चाहिए। |
| ShareItemNoShareUnitMeasure | `21` | आइटम शेयर प्रकार का है और इसमें एक xbrli:शेयर यूनिट माप होना चाहिए। |
| NillItemWithPrecisionOrDecimals | `22` | आइटम शून्य है और इसमें सटीक या दशमलव नहीं होना चाहिए। |
| FractionItemWithPrecisionOrDecimals | `23` | आइटम भिन्न प्रकार का है और उसमें सटीकता या दशमलव नहीं होना चाहिए. |
| NumericItemWithBothPrecisionAndDecimals | `24` | आइटम संख्यात्मक प्रकार का है और इसमें सटीकता और दशमलव दोनों नहीं होने चाहिए. |
| NumericItemWithoutPrecisionOrDecimals | `25` | आइटम संख्यात्मक प्रकार का है और इसमें सटीक या दशमलव होना चाहिए। |
| NonNumericItemWithPrecisionOrDecimals | `26` | आइटम सांख्यिक प्रकार का नहीं है और इसमें सटीकता या दशमलव नहीं होना चाहिए। |
| FootnoteArcFromNotFound | `27` | फुटनोट चाप स्थान से नहीं मिल सकता है। |
| FootnoteArcToNotFound | `28` | फुटनोट चाप फुटनोट को नहीं ढूंढ सकता. |
| DefinitionArcFromNotFound | `29` | डेफिनिशन आर्क लोक से नहीं मिल सकता है। |
| DefinitionArcToNotFound | `30` | डेफिनिशन आर्क लोक को नहीं मिल सकता है। |
| EssenceAliasDefinitionArcDifferentType | `31` | सार-उपनाम परिभाषा चाप के विभिन्न प्रकार हैं। |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | सार-उपनाम परिभाषा चाप में अलग-अलग अवधि प्रकार हैं। |
| EssenceAliasDefinitionArcDifferentBalance | `33` | सार-उपनाम परिभाषा आर्क में अलग-अलग बैलेंस हैं। |
| CalculationArcFromNotFound | `34` | गणना चाप Loc. से नहीं मिल सकता |
| CalculationArcToNotFound | `35` | गणना चाप Loc. को नहीं ढूंढ सकता |
| CalculationArcZeroWeight | `36` | गणना चाप का भार शून्य है। |
| CalculationArcSummationItemNonNumeric | `37` | सारांश आइटम गणना चाप में गैर संख्यात्मक अवधारणा है। |
| CalculationArcIllegalBalancecWeight | `38` | सारांश आइटम गणना चाप में गैर संख्यात्मक अवधारणा है। |
| LabelArcFromNotFound | `39` | लेबल चाप स्थान से नहीं मिल सकता. |
| LabelArcToNotFound | `40` | लेबल चाप लेबल को नहीं ढूंढ सकता. |
| PresentationArcFromNotFound | `41` | प्रेजेंटेशन आर्क लोक से नहीं मिल सकता है। |
| PresentationArcToNotFound | `42` | प्रस्तुति चाप स्थान को नहीं ढूंढ सकता. |
| PresentationArcPreferredLabelNotFound | `43` | प्रस्तुति आर्क पसंदीदा लेबल नहीं ढूंढ सकता. |
| ReferenceArcFromNotFound | `44` | संदर्भ चाप स्थान से नहीं मिल सकता. |
| ReferenceArcToNotFound | `45` | संदर्भ चाप संदर्भ को नहीं मिल सकता है। |
| InlineFactMissContext | `46` | इनलाइन तथ्य संदर्भ नहीं ढूंढ सकता। |
| InlineFactMissUnit | `47` | इनलाइन तथ्य इकाई नहीं ढूंढ सकता। |
| InlineDuplicatedId | `48` | इनलाइन Xbrl दस्तावेज़ में डुप्लिकेट आईडी है. |
| InlineRelationshipMissFromRef | `49` | इनलाइन संबंध ref. से नहीं मिल सकता |
| InlineRelationshipMissToRef | `50` | संदर्भ के लिए इनलाइन संबंध नहीं मिल सकता. |
| InlineRelationshipIllegalFromRef | `51` | रेफरी से इनलाइन संबंध अवैध है। |
| InlineRelationshipIllegalToRef | `52` | इनलाइन संबंध को रेफ करना अवैध है। |
| InlineContinuationNotMatch | `53` | इनलाइन कंटीन्यूएशन का मिलान करना अवैध है। |
| InlineFootnoteNotlang | `54` | इनलाइन फ़ुटनोट में कोई भाषा नहीं है. |
| InlineFractionIllegalChildElement | `55` | इनलाइन फ्रैक्शन में अवैध बाल तत्व है। |
| InlineFractionIllegalAttrbuites | `56` | इनलाइन फ्रैक्शन में अवैध एट्रिब्यूट्स हैं। |
| InlineFractionIllegalAncestor | `57` | इनलाइन अंश में अवैध पूर्वज है। |
| InlineFractionTermNegative | `58` | इनलाइन फ़्रेक्शन का टर्म नेगेटिव है। |
| InlineHeaderIllegalAncestor | `59` | इनलाइन अंश में अवैध टैग है। |
| InlineHeaderDisplayNone | `60` | इनलाइन हेडर फादर डिव नोड में "डिस्प्ले: कोई नहीं" की कोई शैली नहीं है। |
| InlineHeaderIllegalChildElement | `61` | इनलाइन शीर्षलेख में एक से अधिक "छिपे हुए" तत्व या एक से अधिक "संसाधन" तत्व हैं। |
| InlineNonFractionIllegalAncestor | `62` | इनलाइन नॉनफ्रैक्शन का अवैध पूर्वज है। |
| InlineNonFractionIllegalChildElement | `63` | इनलाइन नॉनफ्रैक्शन में अवैध बाल तत्व हैं। |
| InlineNonFractionIllegalProperties | `64` | इनलाइन नॉनफ्रैक्शन में अवैध गुण हैं। |
| InlineNonFractionTermNegative | `65` | इनलाइन नॉनफ्रैक्शन का टर्म नेगेटिव है। |
| InlineTupleIllegalChildElement | `66` | इनलाइन टपल में अवैध तत्व है। |
| InlineContinuationNoId | `67` | ix: निरंतरता तत्व में एक आईडी विशेषता होनी चाहिए.. |
| InlineContinuationIllegalAncestor | `68` | ix: निरंतरता तत्व ix: छिपे हुए तत्व का वंशज नहीं होना चाहिए। |
| InlineExcludeIllegalAncestor | `69` | ix: बहिष्कृत तत्व कम से कम एक ix: निरंतरता, ix: फुटनोट या ix: गैर-संख्यात्मक तत्व का वंशज होना चाहिए। |

### यह सभी देखें

* नाम स्थान [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator/)
* सभा [Aspose.Finance](../../)


