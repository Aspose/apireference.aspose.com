---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption sınıfı"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption sınıfı. C++'ta PageDeviceColorSpaceUsage özelliği seçeneklerini açıklar."
type: docs
weight: 200
url: /tr/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Aşağıdaki [PageDeviceColorSpaceUsage](../) özelliği seçeneklerini açıklar.

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Cihaz, [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) parametresiyle belirtilen profilin cihaz renk uzayı profili olarak kullanılabileceğini belirlerse, aynı profili kullanan tüm öğeler zaten cihaz renk uzayında belirtilmiş gibi kabul edilir. Diğer tüm öğeler MUST bu öğe için belirtilen profili kullanmalıdır. Profil cihaz renk uzayı profili olarak kullanılamazsa, profili kullanan öğeler renk profili kullanan diğer öğeler gibi renk yönetimine tabi olmalıdır. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Eğer [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) parametresiyle belirtilen profilin kanal sayısı cihazın birincil renk sayısıyla eşleşiyorsa, tüm öğeler için cihazın dahili renk yönetimi yerine SHOULD kullanılmalıdır. Bu profili kullanan öğeler cihaz renk uzayında olduğu varsayılır ve daha fazla renk yönetimine tabi tutulmaz. |
## Ayrıca Bakınız

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
