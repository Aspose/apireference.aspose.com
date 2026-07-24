---
title: "System::IO::Stream::FlushAsync विधि"
linktitle: "FlushAsync"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream::FlushAsync विधि। असिंक्रोनस रूप से इस स्ट्रीम के सभी बफ़र को साफ़ करती है, किसी भी बफ़र किए गए डेटा को आधारभूत डिवाइस में लिखती है, और C++ में रद्द करने के अनुरोधों की निगरानी करती है।"
type: docs
weight: 900
url: /hi/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


असिंक्रोनस रूप से इस स्ट्रीम के सभी बफ़र साफ़ करता है, बफ़र किए गए डेटा को आधारभूत डिवाइस में लिखवाता है, और रद्दीकरण अनुरोधों की निगरानी करता है।

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

एक कार्य जो असिंक्रोनस फ्लश ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


असिंक्रोनस रूप से इस स्ट्रीम के सभी बफ़र साफ़ करता है, बफ़र किए गए डेटा को आधारभूत डिवाइस में लिखवाता है, और रद्दीकरण अनुरोधों की निगरानी करता है।

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | रद्द करने के अनुरोधों की निगरानी के लिए टोकन। |

### ReturnValue

एक कार्य जो असिंक्रोनस फ्लश ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
