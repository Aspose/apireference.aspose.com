---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue yöntemi"
linktitle: "get_OldValue"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue yöntemi. Düğümün özgün değerini C++'ta döndürür."
type: docs
weight: 700
url: /tr/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


Düğümün orijinal değerini döndürür.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

Düğümün özgün değeri. Bu yöntem, düğüm bir öznitelik ya da metin düğümü değilse veya düğüm ekleniyorsa **nullptr** döndürür. **XmlDocument::NodeChanging** olayında çağrılırsa, **get_OldValue** değişiklik başarılıysa değiştirilecek mevcut değeri döndürür. **XmlDocument::NodeChanged** olayında çağrılırsa, **get_OldValue** değişiklik öncesindeki düğüm değerini döndürür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
