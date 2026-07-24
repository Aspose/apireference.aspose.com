---
title: "System::Threading::Tasks::TaskScheduler क्लास"
linktitle: "TaskScheduler"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::TaskScheduler क्लास। C++ में थ्रेड्स पर कार्यों को कतारबद्ध करने के निम्न-स्तरीय कार्य को संभालने वाले ऑब्जेक्ट का प्रतिनिधित्व करता है।"
type: docs
weight: 400
url: /hi/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


एक ऑब्जेक्ट का प्रतिनिधित्व करता है जो थ्रेड्स पर टास्क को कतारबद्ध करने के निम्न-स्तरीय कार्य को संभालता है।

```cpp
class TaskScheduler : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | वर्तमान थ्रेड से जुड़ा एक [TaskScheduler](./) बनाता है। |
| static [get_Current](./get_current/)() | वर्तमान में चल रहे कार्य से जुड़ा [TaskScheduler](./) प्राप्त करता है। |
| static [get_Default](./get_default/)() | फ़्रेमवर्क द्वारा प्रदान किए गए डिफ़ॉल्ट [TaskScheduler](./) इंस्टेंस को प्राप्त करता है। |
| [get_Id](./get_id/)() const | इस [TaskScheduler](./) के लिए अद्वितीय ID प्राप्त करता है। |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | इस [TaskScheduler](./) द्वारा समर्थित अधिकतम समवर्ती स्तर को दर्शाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
