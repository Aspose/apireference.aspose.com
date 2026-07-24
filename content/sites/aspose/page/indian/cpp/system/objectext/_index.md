---
title: "System::ObjectExt क्लास"
linktitle: "ObjectExt"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt क्लास। स्थैतिक विधियों को प्रदान करता है जो C# Object विधियों की नकल करती हैं, जिन्हें गैर-Object C++ प्रकारों (स्ट्रिंग्स, संख्याएँ आदि) के लिए बुलाया जाता है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको इसे C++ में किसी भी तरह से इंस्टेंस नहीं बनाना चाहिए।"
type: docs
weight: 4900
url: /hi/cpp/system/objectext/
---
## ObjectExt class


स्थैतिक विधियों को प्रदान करता है जो C# [Object](../object/) विधियों की नकल करती हैं, जिन्हें गैर-Object C++ प्रकारों (स्ट्रिंग्स, संख्याएँ आदि) के लिए बुलाया जाता है। यह एक स्थैतिक प्रकार है जिसमें कोई इंस्टेंस सेवाएँ नहीं हैं। आपको इसे किसी भी तरह से इंस्टेंस नहीं बनाना चाहिए।

```cpp
class ObjectExt : public System::ObjectType
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | ऐरे के मूलभूत मानों को परिवर्तित करता है (जो C# स्वचालित रूप से करता है लेकिन C++ स्पष्ट रूप से नहीं करता)। |
| static [Box](./box/)(const T\&) | मान प्रकारों को [Object](../object/) में परिवर्तित करने के लिए बॉक्स करता है। एनोम प्रकारों के लिए कार्यान्वयन। |
| static [Box](./box/)(const T\&) | मान प्रकारों को [Object](../object/) में परिवर्तित करने के लिए बॉक्स करता है। गैर-एनोम प्रकारों के लिए कार्यान्वयन। |
| static [Box](./box/)(const T\&) | [Nullable](../nullable/) प्रकारों को [Object](../object/) में परिवर्तित करने के लिए बॉक्स करता है। |
| static [Box](./box/)(const String\&) | स्ट्रिंग मानों को बॉक्स करता है। |
| static [BoxEnum](./boxenum/)(T) | एनोम प्रकारों को [Object](../object/) के रूप में प्रसारित करने के लिए बॉक्स करता है। |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | '??' ऑपरेटर अनुवाद का कार्यान्वयन गैर-नल योग्य प्रकारों के लिए। |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | '??' ऑपरेटर अनुवाद का कार्यान्वयन नल योग्य प्रकारों के लिए। |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | '??' ऑपरेटर अनुवाद का कार्यान्वयन गैर-नल योग्य प्रकारों के लिए। यदि RT2, RT1 में परिवर्तनीय है तो ओवरलोड। |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | C# [Object.Equals](../object/equals/) कॉलों का प्रतिस्थापन जो C++ में किसी भी प्रकार के लिए काम करता है। स्मार्ट पॉइंटर प्रकारों के लिए ओवरलोड। |
| static [Equals](./equals/)(T, const T2\&) | C# [Object.Equals](../object/equals/) कॉलों का प्रतिस्थापन जो C++ में किसी भी प्रकार के लिए काम करता है। संरचना प्रकारों के लिए ओवरलोड। |
| static [Equals](./equals/)(const T\&, const T2\&) | C# [Object.Equals](../object/equals/) कॉलों का प्रतिस्थापन जो C++ में किसी भी प्रकार के लिए काम करता है। स्केलर प्रकारों के लिए ओवरलोड। |
| static [Equals](./equals/)(const char_t(&), String) | C# [Object.Equals](../object/equals/) कॉलों का प्रतिस्थापन जो C++ में किसी भी प्रकार के लिए काम करता है। स्ट्रिंग लिटरल के साथ स्ट्रिंग तुलना के लिए ओवरलोड। |
| static [Equals](./equals/)(const float\&, const float\&) | C#-स्टाइल फ्लोटिंग पॉइंट तुलना को एम्यूलेट करता है जहाँ दो NaN को बराबर माना जाता है, भले ही IEC 60559:1989 के अनुसार NaN किसी भी वैल्यू के बराबर नहीं होता, जिसमें NaN भी शामिल है। |
| static [Equals](./equals/)(const double\&, const double\&) | C#-स्टाइल फ्लोटिंग पॉइंट तुलना को एम्यूलेट करता है जहाँ दो NaN को बराबर माना जाता है, भले ही IEC 60559:1989 के अनुसार NaN किसी भी वैल्यू के बराबर नहीं होता, जिसमें NaN भी शामिल है। |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | [GetHashCode()](./gethashcode/) कॉलों को लागू करता है; यह दोनों [Object](../object/) उपवर्गों और असंबंधित प्रकारों पर काम करता है। |
| static [Is](./is/)(const T\&) | 'is' ऑपरेटर अनुवाद को लागू करता है। बॉक्स करने योग्य (मान) प्रकारों के लिए विशेषीकरण, जो वास्तव में वही हैं। |
| static [Is](./is/)(const U\&) | 'is' ऑपरेटर अनुवाद को लागू करता है। 'final' क्लासों के लिए अनुकूलित पॉइंटर प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const U\&) | 'is' ऑपरेटर अनुवाद को लागू करता है। पॉइंटर प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const Object\&) | 'is' ऑपरेटर अनुवाद को लागू करता है। मान प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const Object\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। अपरिवर्तनीय प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 'is' ऑपरेटर अनुवाद को लागू करता है। पॉइंटर प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। अपवाद रैपर प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। nullable प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। == ऑपरेटर परिभाषित वाले बॉक्सेबल प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। बिना परिभाषित == वाले बॉक्सेबल प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const SmartPtr\<V\>\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। इंटरफ़ेस में बॉक्स किए गए वैल्यू प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const SmartPtr\<U\>\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। enum प्रकारों के लिए विशेषीकरण। |
| static [Is](./is/)(const WeakPtr\<U\>\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। enum प्रकारों बनाम कमजोर पॉइंटर्स के लिए विशेषीकरण। |
| static [Is](./is/)(const Nullable\<U\>\&) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। [Nullable](../nullable/) प्रकार के लिए विशेषीकरण। |
| static [Is](./is/)(const char16_t *) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। स्ट्रिंग लिटरल के लिए विशेषीकरण। |
| static [Is](./is/)(int32_t) | ‘is’ ऑपरेटर अनुवाद को लागू करता है। पूर्णांक लिटरल के लिए विशेषीकरण। |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | जाँचता है कि ऑब्जेक्ट बॉक्स्ड वैल्यू है या नहीं। |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/) को अज्ञात प्रकार में परिवर्तित करता है, स्मार्ट पॉइंटर प्रकार और bpxed वैल्यू स्थितियों दोनों को संभालते हुए। |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/) को अज्ञात प्रकार में परिवर्तित करता है, स्मार्ट पॉइंटर प्रकार और बॉक्स्ड वैल्यू स्थितियों दोनों को संभालते हुए। |
| static [ToString](./tostring/)(const char_t *) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(const T\&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(const T\&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(T\&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(T\&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(T\&&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(T\&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(const T\&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [ToString](./tostring/)(T\&&) | किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन। |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) में परिवर्तित करने के बाद वैल्यू प्रकारों को अनबॉक्स करता है। enum प्रकारों के लिए कार्यान्वयन। |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) में परिवर्तित करने के बाद वैल्यू प्रकारों को अनबॉक्स करता है। non-enum और non-nullable प्रकारों के लिए कार्यान्वयन। |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) में परिवर्तित करने के बाद वैल्यू प्रकारों को अनबॉक्स करता है। non-enum और non-nullable प्रकारों के लिए कार्यान्वयन। |
| static [Unbox](./unbox/)(E) | enum प्रकारों को पूर्णांक में अनबॉक्स करता है। |
| static [Unbox](./unbox/)(E) | enum प्रकारों को परिवर्तित करता है। |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | स्ट्रिंग वैल्यू को अनबॉक्स करता है। |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | बॉक्स्ड वैल्यू से स्ट्रिंग को अनबॉक्स करता है। |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | ऑब्जेक्ट को nullable प्रकार में अनबॉक्स करता है। |
| static [UnknownIsNull](./unknownisnull/)(T) | जाँचता है कि अज्ञात प्रकार का ऑब्जेक्ट nullptr है या नहीं। गैर-स्केलर प्रकारों के लिए ओवरलोड। |
| static [UnknownIsNull](./unknownisnull/)(T) | जाँचता है कि अज्ञात प्रकार का ऑब्जेक्ट nullptr है या नहीं। स्केलर प्रकारों के लिए ओवरलोड। |
| static [UnknownToObject](./unknowntoobject/)(T) | अज्ञात प्रकार को [Object](../object/) में परिवर्तित करता है, स्मार्ट पॉइंटर प्रकार और वैल्यू प्रकार स्थितियों दोनों को संभालते हुए। |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | अज्ञात प्रकार को [Object](../object/) में परिवर्तित करता है, स्मार्ट पॉइंटर प्रकार और वैल्यू प्रकार स्थितियों दोनों को संभालते हुए। |
## संबंधित देखें

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
