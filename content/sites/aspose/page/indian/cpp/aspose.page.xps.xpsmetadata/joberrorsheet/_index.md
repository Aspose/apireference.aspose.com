---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet क्लास"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet क्लास। त्रुटि शीट आउटपुट का वर्णन करता है। पूरे कार्य में एक ही त्रुटि शीट होगी। त्रुटि शीट को डिफ़ॉल्ट PageMediaSize पर और डिफ़ॉल्ट PageMediaType का उपयोग करके आउटपुट किया जाना चाहिए। त्रुटि शीट को कार्य के शेष भाग से अलग रखा जाना चाहिए। इसका अर्थ है कि कोई भी समाप्ति या प्रोसेसिंग विकल्प (जैसे JobDuplex, JobStaple, या JobBinding) त्रुटि शीट को शामिल नहीं करना चाहिए। त्रुटि शीट कार्य की अंतिम शीट के रूप में होनी चाहिए। C++ में।"
type: docs
weight: 5300
url: /hi/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


त्रुटि शीट आउटपुट का वर्णन करता है। पूरे कार्य में एक ही त्रुटि शीट होगी। त्रुटि शीट को डिफ़ॉल्ट [PageMediaSize](../pagemediasize/) पर और डिफ़ॉल्ट [PageMediaType](../pagemediatype/) का उपयोग करके आउटपुट किया जाना चाहिए। त्रुटि शीट को कार्य के शेष भाग से अलग रखा जाना चाहिए। इसका अर्थ है कि कोई भी समाप्ति या प्रोसेसिंग विकल्प (जैसे **JobDuplex**, **JobStaple**, या **JobBinding**) त्रुटि शीट को शामिल नहीं करना चाहिए। त्रुटि शीट कार्य की अंतिम शीट के रूप में होनी चाहिए। [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
