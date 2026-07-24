---
title: "System::Threading::WaitHandle::WaitOne मेथड"
linktitle: "WaitOne"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::WaitHandle::WaitOne मेथड। C++ में हैंडल के अनिश्चितकाल तक फायर होने की प्रतीक्षा करता है।"
type: docs
weight: 600
url: /hi/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


असीमित अवधि तक हैंडल के फायर होने का इंतजार करता है।

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

क्योंकि कोई टाइमआउट नहीं होता, हमेशा true लौटाता है।

## संबंधित देखें

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


हैंडल के फायर होने का इंतजार करता है।

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) प्रतीक्षा करने के लिए, मिलीसेकंड में; -1 अनंत प्रतीक्षा दर्शाता है, 0 जांच-और-वापसी दर्शाता है, सकारात्मक मान टाइमआउट होते हैं। |

### ReturnValue

यदि हैंडल फायर हुआ तो true, यदि टाइमआउट समाप्त हो गया तो false।

## संबंधित देखें

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


हैंडल के फायर होने का इंतजार करता है।

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) प्रतीक्षा करने के लिए, मिलीसेकंड में; -1 अनंत प्रतीक्षा दर्शाता है, 0 जांच-और-वापसी दर्शाता है, सकारात्मक मान टाइमआउट होते हैं। |
| exitContext | bool | यदि true हो, तो प्रतीक्षा करने से पहले हैंडल पर लॉक छोड़ देना चाहिए। |

### ReturnValue

यदि हैंडल फायर हुआ तो true, यदि टाइमआउट समाप्त हो गया तो false।

## संबंधित देखें

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


हैंडल के फायर होने का इंतजार करता है।

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| timeout | TimeSpan | एक [System::TimeSpan](../../../system/timespan/) जो प्रतीक्षा करने के मिलीसेकंड की संख्या दर्शाता है, या एक [System::TimeSpan](../../../system/timespan/) जो -1 मिलीसेकंड को अनिश्चितकालीन प्रतीक्षा दर्शाता है। |

### ReturnValue

यदि हैंडल फायर हुआ तो true, यदि टाइमआउट समाप्त हो गया तो false।

## संबंधित देखें

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
