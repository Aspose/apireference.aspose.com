---
title: "Aspose::Page::License::SetLicense metodu"
linktitle: "SetLicense"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::License::SetLicense metodu. Bileşeni C++'ta lisanslar."
type: docs
weight: 400
url: /tr/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


Bileşeni lisanslar.

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| akış | System::SharedPtr\<System::IO::Stream\> | Lisansı içeren bir akış. |
## Açıklamalar



Bu metodu bir akıştan lisans yüklemek için kullanın.

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


Bileşeni lisanslar.

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## Açıklamalar


Lisansı aşağıdaki konumlarda bulmaya çalışır:

1. Açık yol.

<ms>

2. Bileşen derlemesinin klasörü.

3. İstemcinin çağıran derlemesinin klasörü.

4. Giriş derlemesinin klasörü.

5. İstemcinin çağıran derlemesinde gömülü bir kaynak.

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. Açık yol.

2. İstemcinin çağıran derlemesinde gömülü bir kaynak.

</ms>

<java>

2. Bileşen jar dosyasının klasörü.

</java>
## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
