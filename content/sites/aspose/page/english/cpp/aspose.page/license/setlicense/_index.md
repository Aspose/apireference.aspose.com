---
title: Aspose::Page::License::SetLicense method
linktitle: SetLicense
second_title: Aspose.Page for C++
description: 'Aspose::Page::License::SetLicense method. Licenses the component in C++.'
type: docs
weight: 400
url: /cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licenses the component.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | Description |
| --- | --- | --- |
| stream | System::SharedPtr\<System::IO::Stream\> | A stream that contains the license. |
## Remarks



Use this method to load a license from a stream.

<javaName>void setLicense(java.io.InputStream stream)</javaName> 
## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Licenses the component.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Remarks


Tries to find the license in the following locations:

1. Explicit path.

<ms> 

2. The folder of the component assembly.

3. The folder of the client's calling assembly.

4. The folder of the entry assembly.

5. An embedded resource in the client's calling assembly.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Explicit path.

2. An embedded resource in the client's calling assembly.

</ms>

<java> 

2. The folder of the component jar file.

</java>
## See Also

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
