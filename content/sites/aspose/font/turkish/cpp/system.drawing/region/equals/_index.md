---
title: "System::Drawing::Region::Equals yöntemi"
linktitle: "Eşittir"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Region::Equals yöntemi. Belirtilen bölgenin, mevcut nesne tarafından temsil edilen bölgeyle belirtilen çizim yüzeyinde C++'da aynı olup olmadığını belirler."
type: docs
weight: 600
url: /tr/cpp/system.drawing/region/equals/
---
## Region::Equals method


Belirtilen bölgenin, belirtilen çizim yüzeyinde geçerli nesne tarafından temsil edilen bölgeyle aynı olup olmadığını belirler.

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | Bu bölgeyle karşılaştırılacak bölge |
| g | const SharedPtr\<Graphics\>\& | Bir çizim yüzeyi |

### ReturnValue

Belirtilen bölgenin iç kısmı, **g** parametresiyle ilişkili dönüşüm uygulandığında mevcut nesne tarafından temsil edilen bölgenin iç kısmıyla aynıysa doğru; aksi takdirde - yanlış

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
