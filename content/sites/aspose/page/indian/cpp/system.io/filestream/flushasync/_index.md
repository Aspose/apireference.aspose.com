---
title: "System::IO::FileStream::FlushAsync मेथड"
linktitle: "FlushAsync"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::FileStream::FlushAsync मेथड। असिंक्रोनस रूप से इस स्ट्रीम के सभी बफ़र साफ़ करता है, किसी भी बफ़र किए गए डेटा को अंतर्निहित डिवाइस पर लिखता है, और C++ में रद्द करने के अनुरोधों की निगरानी करता है।"
type: docs
weight: 500
url: /hi/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


असिंक्रोनस रूप से इस स्ट्रीम के सभी बफ़र साफ़ करता है, बफ़र किए गए डेटा को आधारभूत डिवाइस में लिखवाता है, और रद्दीकरण अनुरोधों की निगरानी करता है।

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | रद्द करने के अनुरोधों की निगरानी के लिए टोकन। |

### ReturnValue

एक कार्य जो असिंक्रोनस फ्लश ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
