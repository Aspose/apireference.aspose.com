---
title: Aspose::Pub::License::SetLicense method
linktitle: SetLicense
second_title: Aspose.PUB for C++
description: 'Aspose::Pub::License::SetLicense method. Licenses the component in C++.'
type: docs
weight: 200
url: /cpp/aspose.pub/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Licenses the component.

```cpp
void Aspose::Pub::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
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
* Namespace [Aspose::Pub](../../)
* Library [Aspose.PUB for C++](../../../)
## License::SetLicense(System::String) method


Licenses the component.

```cpp
void Aspose::Pub::License::SetLicense(System::String licenseName)
```


| Parameter | Type | Description |
| --- | --- | --- |
| licenseName | System::String | Can be a full or short file name<ms> or name of an embedded resource</ms>. Use an empty string to switch to evaluation mode. |
## Remarks


Tries to find the license in the following locations:

1. Explicit path.

<ms> 

2. The folder that contains the **Aspose** component assembly.

3. The folder that contains the client's calling assembly.

4. The folder that contains the entry (startup) assembly.

5. An embedded resource in the client's calling assembly.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Explicit path.

2. An embedded resource in the client's calling assembly.

</ms>

<java> 

2. The folder that contains the **Aspose** component JAR file.

3. The folder that contains the client's calling JAR file.

</java>

## See Also

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Pub](../../)
* Library [Aspose.PUB for C++](../../../)
