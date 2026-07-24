---
title: "System::Net::Sockets::Socket::IOControl मेथड"
linktitle: "IOControl"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::IOControl मेथड। C++ में सॉकेट के लिए लो‑लेवल ऑपरेटिंग मोड सेट करता है।"
type: docs
weight: 4000
url: /hi/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


सॉकेट के लिए लो-लेवल ऑपरेटिंग मोड सेट करता है।

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ioControlCode | int32_t | प्रदर्शन करने वाले ऑपरेशन का नियंत्रण कोड। |
| optionInValue | System::ArrayPtr\<uint8_t\> | इनपुट डेटा को सम्मिलित करने वाला बाइट एरे। |
| optionOutValue | System::ArrayPtr\<uint8_t\> | आउटपुट डेटा को सम्मिलित करने वाला बाइट एरे। |

### ReturnValue

**optionOutValue** पैरामीटर में बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


सॉकेट के लिए लो-लेवल ऑपरेटिंग मोड सेट करता है।

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ioControlCode | IOControlCode | प्रदर्शन करने वाले ऑपरेशन का नियंत्रण कोड। |
| optionInValue | System::ArrayPtr\<uint8_t\> | इनपुट डेटा को सम्मिलित करने वाला बाइट एरे। |
| optionOutValue | System::ArrayPtr\<uint8_t\> | आउटपुट डेटा को सम्मिलित करने वाला बाइट एरे। |

### ReturnValue

**optionOutValue** पैरामीटर में बाइट्स की संख्या।

## संबंधित देखें

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
