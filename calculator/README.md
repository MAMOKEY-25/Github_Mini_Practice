# 🧑‍💻 Git 실습활동: Team 2 계산기 미니프로젝트

## 📋 프로젝트 인원
- 최무빈
- 전서윤
- 김예슬
- 지송이
- 탁영준

---

## 🏗️ Team 2 레포지토리 구조 및 작업 방식

```
Github_Mini_Practice/
├── team2/
│   └── Calculator/
│         └── src/
│              └── Main.java
│              └── Addition.java
│              └── Division.java
│              └── Multiplication.java
│              └── Subtraction.java
│   └── README.md
└── ...
```

---

## 🏗️ Team 2 브랜치 구조 및 작업 방식
```
Github_Mini_Practice/
├── main
│   └── develop
│         └── team2
│                └── feat/#21_team2-main
│                └── feat/#17_team2-division
│                └── feat/#16_team2-multiplication
│                └── feat/#15_team2-subtraction
│                └── feat/#14_team2-addition
└── ...
```

---

## 💡 커밋 컨벤션

| 타입         | 설명                         |
| ---------- | -------------------------- |
| `Feat`     | 새로운 기능 추가                  |
| `Fix`      | 버그 수정                      |
| `Chore`    | 빌드, 설정 파일 변경 (비즈니스 로직과 무관) |
| `Docs`     | 문서 수정 (README 등)           |
| `Style`    | 코드 포맷팅, 세미콜론 누락 등 비기능적 변경  |
| `Refactor` | 코드 리팩토링 (기능 변화 없음)         |
| `Test`     | 테스트 코드 추가/수정               |
| `Perf`     | 성능 개선                      |
| `Ci`       | CI 설정 변경                   |
| `Build`    | 빌드 시스템이나 의존성에 영향이 있는 변경    |

### **커밋 메세지 형식**  
`[타입/#이슈번호] : 간단한 설명`

### **커밋 메세지 예시**  
`[Feat/#21] : 계산기 메인 기능 추가`

  
**_❗️주의❗️ 커밋 메세지를 적을 때  `띄어쓰기` 주의, 타입 작성 시 첫 글자 대문자로 작성_**


---
