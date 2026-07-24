---
title: "System::Threading::WaitHandle::WaitAny मेथड"
linktitle: "WaitAny"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::WaitHandle::WaitAny मेथड। C++ में किसी भी हैंडल के फायर होने की प्रतीक्षा करता है।"
type: docs
weight: 200
url: /hi/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


किसी भी हैंडल के फायर होने की प्रतीक्षा करता है।

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\\<System::SharedPtr\\<WaitHandle\\>\\>\\& | प्रतीक्षा करने के लिए हैंडल। |

### ReturnValue

जब waitHandles में प्रत्येक तत्व ने सिग्नल प्राप्त किया हो तो true; अन्यथा मेथड कभी वापस नहीं आता।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


किसी भी हैंडल के फायर होने की प्रतीक्षा करता है।

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\\<System::SharedPtr\\<WaitHandle\\>\\>\\& | प्रतीक्षा करने के लिए हैंडल। |
| millisecondsTimeout | int | [Timeout](../../timeout/) प्रतीक्षा करने के लिए, मिलीसेकंड में; -1 अनंत प्रतीक्षा दर्शाता है, 0 जांच-और-वापसी दर्शाता है, सकारात्मक मान टाइमआउट होते हैं। |

### ReturnValue

यदि कोई हैंडल फायर हो गया तो true, यदि टाइमआउट समाप्त हो गया तो false।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


किसी भी हैंडल के फायर होने की प्रतीक्षा करता है।

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\\<System::SharedPtr\\<WaitHandle\\>\\>\\& | प्रतीक्षा करने के लिए हैंडल। |
| timeout | TimeSpan | एक [System::TimeSpan](../../../system/timespan/) जो प्रतीक्षा करने के मिलीसेकंड की संख्या दर्शाता है, या एक [System::TimeSpan](../../../system/timespan/) जो -1 मिलीसेकंड को अनिश्चितकालीन प्रतीक्षा दर्शाता है। |

### ReturnValue

यदि कोई हैंडल फायर हो गया तो true, यदि टाइमआउट समाप्त हो गया तो false।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
