---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() विधि"
linktitle: "operator()"
second_title: "Aspose.Page C++ के लिए"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() विधि। प्रतिनिधि संग्रह में वर्तमान में मौजूद सभी प्रतिनिधियों को बुलाता है। प्रतिनिधियों को उसी क्रम में बुलाया जाता है जिसमें उन्हें संग्रह में जोड़ा गया था। ऑपरेटर C++ में प्रतिनिधियों के निष्पादित होने तक ब्लॉक करता है।"
type: docs
weight: 1400
url: /hi/cpp/system/multicastdelegate_returntype(argumenttypes...)_/operator()/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method


डेलीगेट्स संग्रह में वर्तमान में मौजूद सभी डेलीगेट्स को कॉल करता है। डेलीगेट्स को उसी क्रम में कॉल किया जाता है जैसा कि उन्हें संग्रह में जोड़ा गया था। ऑपरेटर डेलीगेट्स के निष्पादित होने तक ब्लॉक रहता है।

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::operator()(ArgumentTypes... args) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| args | ArgumentTypes... | बुलाए जाने वाले प्रतिनिधियों को पास करने के लिए तर्क |

### ReturnValue

अंतिम बुलाए गए प्रतिनिधि का रिटर्न मान

## संबंधित देखें

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
