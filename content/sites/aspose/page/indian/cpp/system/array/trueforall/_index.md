---
title: "System::Array::TrueForAll मेथड"
linktitle: "TrueForAll"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::TrueForAll मेथड। निर्धारित करता है कि क्या निर्दिष्ट एरे के सभी तत्व निर्दिष्ट प्रेडिकेट द्वारा परिभाषित शर्तों को C++ में संतुष्ट करते हैं।"
type: docs
weight: 5900
url: /hi/cpp/system/array/trueforall/
---
## Array::TrueForAll method


निर्दिष्ट ऐरे में सभी तत्व निर्दिष्ट प्रेडिकेट द्वारा परिभाषित शर्तों को पूरा करते हैं या नहीं, यह निर्धारित करता है।

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) तत्व जिन्हें शर्तों के विरुद्ध मिलान करना है |
| मिलान | System::Predicate\<T\> | एक प्रेडिकेट जो एरे के तत्वों के मिलान की शर्तों को परिभाषित करता है |

### ReturnValue

सही यदि एरे arr के सभी तत्व प्रेडिकेट मैच द्वारा परिभाषित शर्तों को संतुष्ट करते हैं, अन्यथा गलत

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
