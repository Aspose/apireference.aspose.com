---
title: Class XmpMetadata
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.EPS.XMP.XmpMetadata कक्ष. एक्सएमप मेटडेट स्ट्रम तक पहुंच प्रदन करत है
type: docs
weight: 190
url: /hi/net/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class

एक्सएमपी मेटाडेटा स्ट्रीम तक पहुंच प्रदान करता है।

```csharp
public sealed class XmpMetadata : IDictionary<string, XmpValue>
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Count](../../aspose.page.eps.xmp/xmpmetadata/count/) { get; } | संग्रह में तत्वों की संख्या प्राप्त करता है। |
| [IsFixedSize](../../aspose.page.eps.xmp/xmpmetadata/isfixedsize/) { get; } | जाँचता है कि क्या कॉलिसिटॉन का आकार निश्चित है. |
| [IsReadOnly](../../aspose.page.eps.xmp/xmpmetadata/isreadonly/) { get; } | जांचता है कि क्या संग्रह केवल पढ़ने के लिए है. |
| [IsSynchronized](../../aspose.page.eps.xmp/xmpmetadata/issynchronized/) { get; } | जांचता है कि संग्रह सिंक्रनाइज़ है या नहीं। |
| [Item](../../aspose.page.eps.xmp/xmpmetadata/item/) { get; set; } | मेटाडेटा से डेटा प्राप्त या सेट करता है। |
| [Keys](../../aspose.page.eps.xmp/xmpmetadata/keys/) { get; } | मेटाडेटा कुंजियों का संग्रह प्राप्त करता है. |
| [NamespaceManager](../../aspose.page.eps.xmp/xmpmetadata/namespacemanager/) { get; } | नेमस्पेस प्रबंधक प्राप्त करता है। |
| [SyncRoot](../../aspose.page.eps.xmp/xmpmetadata/syncroot/) { get; } | संग्रह तुल्यकालन वस्तु प्राप्त करता है। |
| [Values](../../aspose.page.eps.xmp/xmpmetadata/values/) { get; } | मेटाडेटा में मान प्राप्त करता है. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add)(KeyValuePair&lt;string, XmpValue&gt;) | शब्दकोश में कुंजी और मान के साथ जोड़ी जोड़ता है। |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_2)(string, object) | मेटाडेटा में मूल्य जोड़ता है। |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_1)(string, XmpValue) | मेटाडेटा में मूल्य जोड़ता है। |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem)(string, XmpValue) | सरणी में मान जोड़ता है। मान सरणी के अंत में जोड़ा जाएगा. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem_1)(string, int, XmpValue) | निर्दिष्ट अनुक्रमणिका द्वारा सरणी में मान जोड़ता है। |
| [AddNamedValue](../../aspose.page.eps.xmp/xmpmetadata/addnamedvalue/)(string, string, XmpValue) | एक संरचना में नामित मान जोड़ता है। |
| [Clear](../../aspose.page.eps.xmp/xmpmetadata/clear/)() | मेटाडेटा साफ़ करता है। |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains)(KeyValuePair&lt;string, XmpValue&gt;) | निर्दिष्ट की-वैल्यू पेयर को डिक्शनरी में शामिल किए जाने की जाँच करता है। |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains_1)(string) | चेक करता है कुंजी मेटाडेटा में निहित है। |
| [ContainsKey](../../aspose.page.eps.xmp/xmpmetadata/containskey/)(string) | निर्धारित करता है कि क्या इस शब्दकोश में निर्दिष्ट कुंजी है। |
| [CopyTo](../../aspose.page.eps.xmp/xmpmetadata/copyto/)(KeyValuePair&lt;string, XmpValue&gt;[], int) | संग्रह के तत्वों को सरणी में कॉपी करता है। |
| [GetEnumerator](../../aspose.page.eps.xmp/xmpmetadata/getenumerator/)() | डिक्शनरी एन्युमरेटर लौटाता है। |
| [GetNamespaceUriByPrefix](../../aspose.page.eps.xmp/xmpmetadata/getnamespaceuribyprefix/)(string) | उपसर्ग द्वारा नाम स्थान URI लौटाता है। |
| [GetPrefixByNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/getprefixbynamespaceuri/)(string) | नामस्थान यूआरआई द्वारा उपसर्ग लौटाता है। |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri)(string, string) | नामस्थान यूआरआई पंजीकृत करता है। |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri_1)(string, string, string) | नामस्थान यूआरआई पंजीकृत करता है। |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove)(KeyValuePair&lt;string, XmpValue&gt;) | कुंजी/मान युग्म को संग्रह से निकालता है. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove_1)(string) | मेटाडेटा से प्रविष्टि निकालता है। |
| [SetArrayItem](../../aspose.page.eps.xmp/xmpmetadata/setarrayitem/)(string, int, XmpValue) | किसी सरणी में मान सेट करता है। पिछला मान नए मान से बदल दिया जाएगा. |
| [SetNamedValue](../../aspose.page.eps.xmp/xmpmetadata/setnamedvalue/)(string, string, XmpValue) | नामित मान को संरचना में सेट करता है। पिछला नामित मान, यदि पहले से मौजूद है, तो उसे नए मान से बदल दिया जाएगा. |
| [TryGetValue](../../aspose.page.eps.xmp/xmpmetadata/trygetvalue/)(string, out XmpValue) | शब्दकोश में कुंजी खोजने की कोशिश करता है और यदि पाया जाता है तो मूल्य को पुनः प्राप्त करता है। |

### यह सभी देखें

* class [XmpValue](../xmpvalue/)
* नाम स्थान [Aspose.Page.EPS.XMP](../../aspose.page.eps.xmp/)
* सभा [Aspose.Page](../../)


