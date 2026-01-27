<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kết Quả BMI</title>
    <link rel="stylesheet" href="css/bmi-result.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@300;400;600;700;800&family=Poppins:wght@500;600;700&display=swap" rel="stylesheet">
</head>
<body>
    <div class="background-decoration">
        <div class="circle circle-1"></div>
        <div class="circle circle-2"></div>
        <div class="wave"></div>
    </div>

    <div class="container">
        <div class="result-header">
            <div class="status-icon">
                <svg viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M9 12l2 2 4-4m6 2a9 9 0 11-18 0 9 9 0 0118 0z" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
                </svg>
            </div>
            <h1>Kết Quả BMI</h1>
            <p class="result-subtitle">Đã tính toán thành công</p>
        </div>

        <div class="bmi-score-section">
            <div class="score-label">Chỉ số BMI của bạn</div>
            <div class="score-value">
                <span class="score-number" id="bmiValue">${bmi}</span>
            </div>
            <div class="score-category">
                <span class="category-badge" id="category">${category}</span>
            </div>
        </div>

        <div class="health-info">
            <div class="info-item">
                <div class="info-icon">
                    <svg viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path d="M12 2v20M8 6l4-4 4 4" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
                    </svg>
                </div>
                <div class="info-content">
                    <div class="info-label">Chiều cao</div>
                    <div class="info-value" id="heightValue">${height} m</div>
                </div>
            </div>
            
            <div class="info-item">
                <div class="info-icon">
                    <svg viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <circle cx="12" cy="12" r="10" stroke="currentColor" stroke-width="2"/>
                        <path d="M12 6v6l4 2" stroke="currentColor" stroke-width="2" stroke-linecap="round"/>
                    </svg>
                </div>
                <div class="info-content">
                    <div class="info-label">Cân nặng</div>
                    <div class="info-value" id="weightValue">${weight} kg</div>
                </div>
            </div>
        </div>

        <div class="recommendation-section">
            <h3>Khuyến nghị</h3>
            <div class="recommendation-card">
                <div class="recommendation-icon">
                    <svg viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path d="M13 2L3 14h9l-1 8 10-12h-9l1-8z" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
                    </svg>
                </div>
                <p id="recommendation">${advice}</p>
            </div>
        </div>

        <div class="action-buttons">
            <a href="BMI" class="btn-secondary">
                <svg viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M19 12H5M12 19l-7-7 7-7" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
                </svg>
                Tính lại
            </a>
            <button class="btn-primary" onclick="window.print()">
                <svg viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M17 17h2a2 2 0 002-2v-4a2 2 0 00-2-2H5a2 2 0 00-2 2v4a2 2 0 002 2h2M9 21h6a2 2 0 002-2v-4H7v4a2 2 0 002 2z" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
                    <path d="M7 11V7a2 2 0 012-2h6a2 2 0 012 2v4" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
                </svg>
                In kết quả
            </button>
        </div>
    </div>

  
</body>
</html>
