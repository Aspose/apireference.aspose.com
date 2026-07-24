---
title: "System::SmartPtr::ValueType typedef"
linktitle: "ValueType"
second_title: "Aspose.Page C++ के लिए"
description: "System::SmartPtr::ValueType typedef। पॉइंट किए गए एरे का स्टोरेज प्रकार। केवल तब अर्थपूर्ण जब T C++ में System::Array का एक विशेषीकरण हो।"
type: docs
weight: 4100
url: /hi/cpp/system/smartptr/valuetype/
---
## ValueType typedef


पॉइंट किए गए एरे का स्टोरेज प्रकार। केवल तब अर्थपूर्ण जब T [System::Array](../../array/) का एक विशेषीकरण हो।

```cpp
using System::SmartPtr< T >::ValueType =  typename System::Details::SelectType<typename System::Details::ArrayTypeResolver<T>::value_type>::type
```

## संबंधित देखें

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
