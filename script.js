import React,{useState,useEffect} from 'react';
import {Card,CardContent} from '@/components/ui/card';
import {Button} from '@/components/ui/button';

const movies = [
    { title: 'Stranger Things', image: 'https://via.placeholder.com/300x450', genre: 'Sci-Fi' },
    { title: 'Money Heist', image: 'https://via.placeholder.com/300x450', genre: 'Crime' },
    { title: 'The Witcher', image: 'https://via.placeholder.com/300x450', genre: 'Fantasy' },
    { title: 'Squid Game', image: 'https://via.placeholder.com/300x450', genre: 'Thriller' }
];

export default function NetflixFrontEnd() {
    const [search, setSearch] = useState('');
    const [filteredMovies, setFilteredMovies] = useState(movies);

    useEffect(() => {
        setFilteredMovies(
            movies.filter(movie =>
                movie.title.toLowerCase().includes(search.toLowerCase())
            )
        );
    }, [search]);

    return (
        <div className="bg-black text-white min-h-screen p-8">
            <h1 className="text-4xl font-bold mb-4">Netflix Clone</h1>
            <input
                type="text"
                placeholder="Search..."
                value={search}
                onChange={(e) => setSearch(e.target.value)}
                className="p-2 rounded-md bg-gray-800 text-white w-full mb-6"
            />
            <div className="grid grid-cols-4 gap-4">
                {filteredMovies.map((movie, index) => (
                    <Card key={index} className="bg-gray-900 rounded-xl">
                        <img src={movie.image} alt={movie.title} className="rounded-t-xl" />
                        <CardContent className="p-4">
                            <h2 className="text-xl font-semibold">{movie.title}</h2>
                            <p className="text-gray-400">{movie.genre}</p>
                            <Button className="mt-2 w-full">Watch Now</Button>
                        </CardContent>
                    </Card>
                ))}
            </div>
        </div>
    );
}
