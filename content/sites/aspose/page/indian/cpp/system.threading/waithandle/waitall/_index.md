---
title: "System::Threading::WaitHandle::WaitAll मेथड"
linktitle: "WaitAll"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::WaitHandle::WaitAll मेथड। C++ में सभी हैंडल के फायर होने की प्रतीक्षा करता है।"
type: docs
weight: 100
url: /hi/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


सभी हैंडल के फायर होने की प्रतीक्षा करता है।

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
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
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


RTTI जानकारी।

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\\<System::SharedPtr\\<WaitHandle\\>\\>\\& | प्रतीक्षा करने के लिए हैंडल। |
| millisecondsTimeout | int | [Timeout](../../timeout/) प्रतीक्षा करने के लिए, मिलीसेकंड में; -1 अनंत प्रतीक्षा दर्शाता है, 0 जांच-और-वापसी दर्शाता है, सकारात्मक मान टाइमआउट होते हैं। |

### ReturnValue

यदि सभी हैंडल फायर हुए हों तो true, यदि टाइमआउट समाप्त हो गया हो तो false।
## टिप्पणियाँ


सभी हैंडल के फायर होने की प्रतीक्षा करता है।
## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


सभी हैंडल के फायर होने की प्रतीक्षा करता है।

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\\<System::SharedPtr\\<WaitHandle\\>\\>\\& | प्रतीक्षा करने के लिए हैंडल। |
| timeout | TimeSpan | एक [System::TimeSpan](../../../system/timespan/) जो प्रतीक्षा करने के मिलीसेकंड की संख्या दर्शाता है, या एक [System::TimeSpan](../../../system/timespan/) जो -1 मिलीसेकंड को अनिश्चितकालीन प्रतीक्षा दर्शाता है। |

### ReturnValue

यदि सभी हैंडल फायर हुए हों तो true, यदि टाइमआउट समाप्त हो गया हो तो false।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
