---
title: "System::Threading::Thread::Join मेथड"
linktitle: "Join"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Thread::Join मेथड। प्रबंधित थ्रेड को जोड़ता है। आवश्यक होने पर C++ में असीमित प्रतीक्षा करता है।"
type: docs
weight: 1400
url: /hi/cpp/system.threading/thread/join/
---
## Thread::Join() method


प्रबंधित थ्रेड से जुड़ता है। यदि आवश्यक हो तो असीमित प्रतीक्षा करता है।

```cpp
void System::Threading::Thread::Join()
```

## संबंधित देखें

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(int) method


प्रबंधित थ्रेड से जुड़ता है। सीमित प्रतीक्षा करता है।

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| millisecondsTimeout | int | मिलीसेकंड में प्रतीक्षा टाइमआउट। |

### ReturnValue

यदि थ्रेड सफलतापूर्वक जुड़ गया हो तो true, यदि टाइमआउट पार हो गया हो तो false।

## संबंधित देखें

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(TimeSpan) method


प्रबंधित थ्रेड से जुड़ता है। सीमित प्रतीक्षा करता है।

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| timeout | TimeSpan | एक [TimeSpan](../../../system/timespan/) सेट जो थ्रेड के समाप्त होने की प्रतीक्षा करने के समय की मात्रा को दर्शाता है। |

### ReturnValue

यदि थ्रेड सफलतापूर्वक जुड़ गया हो तो true, यदि टाइमआउट पार हो गया हो तो false।

## संबंधित देखें

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
