---
title: "System::Text::StringBuilder::AppendFormat طريقة"
linktitle: "AppendFormat"
second_title: "Aspose.Font لـ C++"
description: "System::Text::StringBuilder::AppendFormat طريقة. يضيف السلسلة المُنسقة إلى المُنشئ في C++."
type: docs
weight: 400
url: /ar/cpp/system.text/stringbuilder/appendformat/
---
## StringBuilder::AppendFormat(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) method


يضيف سلسلة مُنسقة إلى المُنشئ.

```cpp
template<class...> StringBuilder * System::Text::StringBuilder::AppendFormat(const SharedPtr<IFormatProvider> &fp, const String &format, const TArgs &... args)
```


| معامل | الوصف |
| --- | --- |
| TArgs | نوع الوسائط. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| fp | const SharedPtr\<IFormatProvider\>\& | مُزوّد التنسيق؛ مُهمل. |
| صيغة | const String\& | سلسلة التنسيق. |
| args | const TArgs\&... | الوسائط لإدراجها في مواضع سلسلة التنسيق. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IFormatProvider](../../../system/iformatprovider/)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::AppendFormat(const String\&, const TArgs\&...) method


يضيف سلسلة مُنسقة إلى المُنشئ.

```cpp
template<class...> StringBuilder * System::Text::StringBuilder::AppendFormat(const String &format, const TArgs &... args)
```


| معامل | الوصف |
| --- | --- |
| TArgs | نوع الوسائط. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| صيغة | const String\& | سلسلة التنسيق. |
| args | const TArgs\&... | الوسائط لإدراجها في مواضع سلسلة التنسيق. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
