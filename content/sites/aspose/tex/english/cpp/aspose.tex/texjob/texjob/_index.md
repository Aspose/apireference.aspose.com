---
title: Aspose::TeX::TeXJob::TeXJob constructor
linktitle: TeXJob
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::TeXJob::TeXJob constructor. Creates a TeX job for running the engine in production mode to typeset a TeX document. The engine will prompt the file name as soon as it starts. Thus this run is supposed to be interactive in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex/texjob/texjob/
---
## TeXJob::TeXJob(System::SharedPtr\<Aspose::TeX::Presentation::Device\>, System::SharedPtr\<Aspose::TeX::TeXOptions\>) constructor


Creates a [TeX](../../) job for running the engine in production mode to typeset a [TeX](../../) document. The engine will prompt the file name as soon as it starts. Thus this run is supposed to be interactive.

```cpp
Aspose::TeX::TeXJob::TeXJob(System::SharedPtr<Aspose::TeX::Presentation::Device> device, System::SharedPtr<Aspose::TeX::TeXOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| device | System::SharedPtr\<Aspose::TeX::Presentation::Device\> | The device defining output representation. |
| options | System::SharedPtr\<Aspose::TeX::TeXOptions\> | [TeX](../../) engine run options. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Device](../../../aspose.tex.presentation/device/)
* Class [TeXOptions](../../texoptions/)
* Class [TeXJob](../)
* Namespace [Aspose::TeX](../../)
* Library [Aspose.TeX for C++](../../../)
## TeXJob::TeXJob(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Aspose::TeX::Presentation::Device\>, System::SharedPtr\<Aspose::TeX::TeXOptions\>) constructor


Creates a [TeX](../../) job for running the engine in production mode to typeset a [TeX](../../) file.

```cpp
Aspose::TeX::TeXJob::TeXJob(System::SharedPtr<System::IO::Stream> stream, System::SharedPtr<Aspose::TeX::Presentation::Device> device, System::SharedPtr<Aspose::TeX::TeXOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| stream | System::SharedPtr\<System::IO::Stream\> | The stream containing the [TeX](../../) file. |
| device | System::SharedPtr\<Aspose::TeX::Presentation::Device\> | The device defining output representation. |
| options | System::SharedPtr\<Aspose::TeX::TeXOptions\> | [TeX](../../) engine run options. |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Device](../../../aspose.tex.presentation/device/)
* Class [TeXOptions](../../texoptions/)
* Class [TeXJob](../)
* Namespace [Aspose::TeX](../../)
* Library [Aspose.TeX for C++](../../../)
## TeXJob::TeXJob(System::String, System::SharedPtr\<Aspose::TeX::Presentation::Device\>, System::SharedPtr\<Aspose::TeX::TeXOptions\>) constructor


Creates a [TeX](../../) job for running the engine in production mode to typeset a [TeX](../../) file.

```cpp
Aspose::TeX::TeXJob::TeXJob(System::String path, System::SharedPtr<Aspose::TeX::Presentation::Device> device, System::SharedPtr<Aspose::TeX::TeXOptions> options)
```


| Parameter | Type | Description |
| --- | --- | --- |
| path | System::String | The path to the [TeX](../../) file. |
| device | System::SharedPtr\<Aspose::TeX::Presentation::Device\> | The device defining output representation. |
| options | System::SharedPtr\<Aspose::TeX::TeXOptions\> | [TeX](../../) engine run options. |

## See Also

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Device](../../../aspose.tex.presentation/device/)
* Class [TeXOptions](../../texoptions/)
* Class [TeXJob](../)
* Namespace [Aspose::TeX](../../)
* Library [Aspose.TeX for C++](../../../)
