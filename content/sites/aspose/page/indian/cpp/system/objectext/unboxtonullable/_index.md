---
title: "System::ObjectExt::UnboxToNullable मेथड"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::UnboxToNullable मेथड। ऑब्जेक्ट को C++ में nullable प्रकार में अनबॉक्स करता है।"
type: docs
weight: 1600
url: /hi/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


ऑब्जेक्ट को nullable प्रकार में अनबॉक्स करता है।

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | गंतव्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) को अनबॉक्स करने के लिए। |
| सुरक्षित | bool | यदि सत्य है, तो विफलता पर nullptr लौटाएँ, अन्यथा InvalidCastException फेंकेँ। |

### ReturnValue

अनबॉक्स्ड nullable मान (null भी हो सकता है)।

## संबंधित देखें

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
