---
title: Feature.GetValueOrDefault
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Feature तरक. कस वशेषत क मन प्रप्त करत है यDefaultValue यद मन सेट नहं है यव्यर्थ .
type: docs
weight: 40
url: /hi/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

किसी विशेषता का मान प्राप्त करता है, या[`DefaultValue`](../../featureattribute/defaultvalue/) यदि मान सेट नहीं है या`व्यर्थ` .

```csharp
public T GetValueOrDefault<T>(string attributeName)
```

| पैरामीटर | विवरण |
| --- | --- |
| T | मूल्य के लिए वांछित प्रकार। |
| attributeName | विशेषता का नाम। |

### प्रतिलाभ की मात्रा

विशेषता का मूल्य।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता का नाम है`null`. |
| ArgumentException | इस परत में इस नाम की विशेषता मौजूद नहीं है। |
| InvalidOperationException | विशेषता लॉक नहीं है। |
| InvalidOperationException | इस विशेषता के लिए इस विशेषता का मान निर्धारित नहीं है। |
| InvalidCastException | अनुरोधित प्रकार लागू नहीं होता हैIConvertible. |
| InvalidCastException | गुण का मान है`null`, लेकिन अनुरोधित प्रकार एक मान प्रकार है। |
| FormatException | रूपांतरण विफल हुआ क्योंकि मान गलत प्रारूप में है। |
| OverflowException | अतिप्रवाह के कारण रूपांतरण विफल रहा। |

### टिप्पणियों

यह विधि मूल्य को सामान्य प्रकार के पैरामीटर में अनुरोधित प्रकार में स्वचालित रूप से परिवर्तित करती है।

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

किसी विशेषता का मान प्राप्त करता है, या[`DefaultValue`](../../featureattribute/defaultvalue/) यदि मान सेट नहीं है या`व्यर्थ` .

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| attributeName | String | विशेषता का नाम। |
| defaultValue | Object | यदि विशेषता मान अनुपलब्ध है, तो लौटाया जाने वाला मान. डिफ़ॉल्ट मान है`null` . |

### प्रतिलाभ की मात्रा

विशेषता का मूल्य।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता का नाम है`null`. |
| ArgumentException | इस परत में इस नाम की विशेषता मौजूद नहीं है। |
| InvalidOperationException | विशेषता लॉक नहीं है। |
| InvalidOperationException | इस विशेषता के लिए इस विशेषता का मान निर्धारित नहीं है। |

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

किसी विशेषता का मान प्राप्त करता है, या[`DefaultValue`](../../featureattribute/defaultvalue/) यदि मान सेट नहीं है या`व्यर्थ` .

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| पैरामीटर | विवरण |
| --- | --- |
| T | मूल्य के लिए वांछित प्रकार। |
| attributeName | विशेषता का नाम। |
| defaultValue | यदि विशेषता मान अनुपलब्ध है, तो लौटाया जाने वाला मान. |

### प्रतिलाभ की मात्रा

विशेषता का मूल्य।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | विशेषता का नाम है`null`. |
| ArgumentException | इस परत में इस नाम की विशेषता मौजूद नहीं है। |
| InvalidOperationException | विशेषता लॉक नहीं है। |
| InvalidOperationException | इस विशेषता के लिए इस विशेषता का मान निर्धारित नहीं है। |
| InvalidCastException | अनुरोधित प्रकार लागू नहीं होता हैIConvertible. |
| InvalidCastException | गुण का मान है`null`, लेकिन अनुरोधित प्रकार एक मान प्रकार है। |
| FormatException | रूपांतरण विफल हुआ क्योंकि मान गलत प्रारूप में है। |
| OverflowException | अतिप्रवाह के कारण रूपांतरण विफल रहा। |

### टिप्पणियों

यह विधि मूल्य को सामान्य प्रकार के पैरामीटर में अनुरोधित प्रकार में स्वचालित रूप से परिवर्तित करती है।

### यह सभी देखें

* class [Feature](../)
* नाम स्थान [Aspose.Gis](../../feature/)
* सभा [Aspose.GIS](../../../)


