from flask import Flask,render_template

app = Flask(__name__)

#default route
@app.route('/')
def anything():
    return render_template('home.html')

@app.route('/login')
def login():
    return render_template('login.html')    

@app.route('/carousel')
def carousel():
    return render_template('carousel.html') 

@app.route('/home')
def home():
    return render_template('home.html')   

@app.route('/footer')
def footer():
    return render_template('footer.html') 

@app.route('/printvar')
def printvar():
    name='swala'
    amount=3_000
    return render_template('printvar.html',user=name,price=amount)   

@app.route('/register')
def register():
    return render_template('register.html')       






 